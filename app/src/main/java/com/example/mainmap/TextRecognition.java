package com.example.mainmap;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.korean.KoreanTextRecognizerOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextRecognition extends AppCompatActivity implements View.OnClickListener {
    static final int REQUEST_CODE = 2;
    private FirebaseDatabase mDatabase=FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = mDatabase.getReference("전통주");
    ImageView imageView;    // 갤러리에서 가져온 이미지를 보여줄 뷰
    Uri uri;                // 갤러리에서 가져온 이미지에 대한 Uri
    Bitmap bitmap;          // 갤러리에서 가져온 이미지를 담을 비트맵
    InputImage image;       // ML 모델이 인식할 인풋 이미지
    TextView text_info;     // ML 모델이 인식한 텍스트를 보여줄 뷰
    ImageButton btn_get_image, btn_detection_image, btn_film_image, btn_add_drink;  // 이미지 가져오기 버튼, 이미지 인식 버튼,촬영하기 버튼
    TextRecognizer recognizer;    //텍스트 인식에 사용될 모델
    String txt;

    String mCurrentPhotoPath;
    static final int REQUEST_TAKE_PHOTO = 1;

    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = image.getAbsolutePath();
        return image;
    }
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // Ensure that there's a camera activity to handle the intent
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            // Create the File where the photo should go
            File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                // Error occurred while creating the File
            }
            // Continue only if the File was successfully created
            if (photoFile != null) {
                Uri photoURI = FileProvider.getUriForFile(this,
                        "com.example.mainmap",
                        photoFile);
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textrecognition);
//        mDatabase = FirebaseDatabase.getInstance();
        imageView = findViewById(R.id.imageView);
        text_info = findViewById(R.id.text_info);
        recognizer = com.google.mlkit.vision.text.TextRecognition.getClient(new KoreanTextRecognizerOptions.Builder().build());    //텍스트 인식에 사용될 모델
        btn_film_image = (ImageButton) findViewById(R.id.btn_film_image);
        // GET IMAGE 버튼
        btn_get_image = findViewById(R.id.btn_get_image);
        btn_get_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        // IMAGE DETECTION 버튼
        btn_detection_image = findViewById(R.id.btn_detection_image);
        btn_detection_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextRecognition_method(recognizer);
            }
        });

        // 촬영하기 버튼
        btn_film_image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    // 카메라촬영 클릭 이벤트
                    case R.id.btn_film_image:
                        dispatchTakePictureIntent();
                        break;
                    // 카메라 기능을 Intent
//                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                        startActivityForResult(intent, 0);
//                        break;
                }
            }
        });


        btn_add_drink = findViewById(R.id.btn_add_drink);
        btn_add_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextRecognition.this, ReviewActivity.class);
                intent.putExtra("key", txt);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            // 갤러리에서 선택한 사진에 대한 uri를 가져온다.
            uri = data.getData();

//            Glide.with(this).load(uri).into(imageView);
            setImageUri(uri);
        }
        // 카메라 촬영을 하면 이미지뷰에 사진 삽입
        if (requestCode == 1 && resultCode == RESULT_OK) {
            // Bundle로 데이터를 입력
//            Bundle extras = data.getExtras();
//            setImageBundle(extras);
            try {
                switch (requestCode) {
                    case REQUEST_TAKE_PHOTO: {
                        if (resultCode == RESULT_OK) {
                            File file = new File(mCurrentPhotoPath);
                            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.fromFile(file));
                            if (bitmap != null) {
                                imageView.setImageBitmap(bitmap);
                                image = InputImage.fromBitmap(bitmap,0);
                            }
                        }
                        break;
                    }
                }

            } catch (Exception error) {
                error.printStackTrace();
            }
//            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
//            imageView.setImageBitmap(bitmap);
//
//            image = InputImage.fromBitmap(bitmap, 0);
        }
    }

    // uri를 비트맵으로 변환시킨후 이미지뷰에 띄워주고 InputImage를 생성하는 메서드
    private void setImageUri(Uri uri) {
        try {
            InputStream in = getContentResolver().openInputStream(uri);
            //Bitmap으로 컨버전
            bitmap = BitmapFactory.decodeStream(in);
            //이미지뷰에 Bitmap으로 이미지를 입력
//            imageView.setImageBitmap(bitmap);
            Glide.with(this).load(bitmap).into(imageView);
            image = InputImage.fromBitmap(bitmap, 0);
            Log.e("setImage", "이미지 to 비트맵");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Bundle을 비트맵으로 변환 시킨 후 이미지뷰에 띄워주고 InputImage를 생성하는 메서드
    private void setImageBundle(Bundle extras) {
        try {
            // Bitmap으로 컨버전
//            Bitmap bitmap = BitmapFactory.decodeStream(this.getContentResolver().openInputStream(uri), null, null);
            Bitmap bitmap = (Bitmap) extras.get("data");
            // 이미지뷰에 Bitmap으로 이미지를 입력
            imageView.setImageBitmap(bitmap);

            image = InputImage.fromBitmap(bitmap, 0);
            Log.e("setImage", "이미지 to 비트맵");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void TextRecognition_method(TextRecognizer recognizer) {Task<Text> result = recognizer.process(image)
            // 이미지 인식에 성공하면 실행되는 리스너
            .addOnSuccessListener(new OnSuccessListener<Text>() {
                @Override
                public void onSuccess(Text visionText) {
                    Log.e("텍스트 인식", "성공");
                    // Task completed successfully
                    String resultText = visionText.getText();
                    StringBuffer process_string = new StringBuffer();
                    for (int i = 0; i < resultText.length(); ++i) {
                        if (resultText.charAt(i) >= '가')
                            process_string.append(resultText.charAt(i));
                    }
                    databaseReference.addValueEventListener(new ValueEventListener() {
                        double b = 0;
                        //StringBuffer recognition=new StringBuffer(process_string);
                        char[] splited_recognition = korean_split(process_string);
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for (DataSnapshot messageData : snapshot.getChildren()) {
                                String s = messageData.child("이름").getValue(String.class);
                                s = s.replaceAll(" ","");
                                StringBuffer drink_name = new StringBuffer(s);
                                char[] splited_drink1 = korean_split(drink_name);
                                //항상 splited_recognition의 크기가 클때만 비교, 만약 더 작으면 같을수 없기 때문

                                if(splited_recognition.length>=splited_drink1.length){
                                    if (comparison_string(splited_recognition, splited_drink1) > b)
                                    {
                                        txt= messageData.child("이름").getValue(String.class);
                                        b = comparison_string(splited_recognition, splited_drink1);
                                    }
                                }
                                else {
                                    if(comparison_string(splited_drink1, splited_recognition) > b)
                                    {
                                        txt = messageData.child("이름").getValue(String.class);
                                        b = comparison_string(splited_drink1, splited_recognition);
                                    }
                                }
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    text_info.setText(process_string); // 인식한 텍스트를 TextView에
                }

            })
            // 이미지 인식에 실패하면 실행되는 리스너
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.e("텍스트 인식", "실패: " + e.getMessage());
                }
            });
    }

    @Override
    public void onClick(View view) {

    }

    private char[] korean_split(StringBuffer process_string) {
        char[] splited_string = new char[process_string.length() * 3];

        for (int i = 0; i < process_string.length(); ++i) {
            char uniVal = (char) (process_string.charAt(i) - 0xAC00);

            char cho = (char) (uniVal / 28 / 21);
            char joong = (char) (uniVal / 28 % 21);
            char jong = (char) (uniVal % 28);

            splited_string[i * 3] = cho;
            splited_string[i * 3 + 1] = joong;
            splited_string[i * 3 + 2] = jong;

        }
        return splited_string;
    }

    private double comparison_string(char[] recognition_text, char[] drink_name) {
        double max = 0;
        double len=drink_name.length;
        for (int i = 0; i < recognition_text.length - drink_name.length + 1; ++i) {
            double score = 0;
            int one_letter = 0;
            for (int j = 0; j < drink_name.length; ++j) {
                if (recognition_text[i + j] == drink_name[j]) {
                    ++score;
                    ++one_letter;
                }
                if(j % 3 == 2) {
                    if(one_letter == 3)
                        score += (double)one_letter;
                    one_letter = 0;
                }
            }
            if (max < score)
                max = score;
        }
        return max/len;
    }
}