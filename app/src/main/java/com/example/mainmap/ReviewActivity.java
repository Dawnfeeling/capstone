package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReviewActivity extends AppCompatActivity {

    //파이어 베이스 DB연동
    private FirebaseDatabase review_db = FirebaseDatabase.getInstance();

    //DatabaseReference는 데이터베이스의 특정 위치로 연결하는 거라고 생각하면 된다.
    //현재 연결은 데이터베이스에만 딱 연결해놓고
    //키값(테이블 또는 속성)의 위치 까지는 들어가지는 않은 모습이다.
    private DatabaseReference databaseReference = review_db.getReference();
    private String uid = null;
    private String uemail = null;
    private String drink_name;
    Button cancel_btn, ok_btn;
    EditText review_Edit;
    RatingBar review_Rating;
    TextView review_txt;
    String area;
    String[] review_number;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        cancel_btn = findViewById(R.id.cancelButton);
        ok_btn = findViewById(R.id.okButton);
        review_Edit = findViewById(R.id.reviewEdit);
        review_Rating = findViewById(R.id.reviewRating);
        review_txt=findViewById(R.id.reviewText);

        //UID
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();  //현재로그인한 아이디
        uemail=user.getEmail();
        drink_name=getIntent().getStringExtra("key");

        //area
        databaseReference.child("전통주").child(drink_name).child("지역").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    area = String.valueOf(task.getResult().getValue()).substring(0,2);
                    if(area.equals("서울"))
                        area = "경기";
                    Log.d("firebase", area);
                }
            }
        });

        //review_number
        databaseReference.child("고객").child(uid).child("리뷰개수").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    review_number = String.valueOf(task.getResult().getValue()).split(" ");
                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        review_txt.setText(review_txt.getText()+"/"+drink_name);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_review(uid,drink_name, review_Edit.getText().toString(),area,review_Rating.getRating());
                Intent intent = new Intent(ReviewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void add_review(String uid, String drink_name,String review_content,String area, float rating_value) {

        ReviewComponent ReviewComponent = new ReviewComponent(drink_name,review_content,rating_value,uemail,area);
        //uid안에 내가 마신 술의 지역의 리뷰 개수를 갱신
        databaseReference.child("고객").child(uid).child(drink_name).child("email").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if(String.valueOf(task.getResult().getValue()).equals("null")) {
                    review_number = review_number_plus(review_number, area);
                    databaseReference.child("고객").child(uid).child("리뷰개수").setValue(String.valueOf(review_number_list_tostring(review_number)));
                }
                Log.e("firebase",String.valueOf(task.getResult().getValue()));
            }
        });
        //uid 안에 drink_name에 따라 리뷰 내용을 저장
        databaseReference.child("고객").child(uid).child(drink_name).setValue(ReviewComponent);
    }

    //지역에 따라 값을 증가 시키는 함수
    public String[] review_number_plus(String[] review_number, String area) {
        switch (area) {
            case "서울" :
                review_number[0] = String.valueOf(Integer.parseInt(review_number[0])+1);
                break;
            case "경기" :
                review_number[0] = String.valueOf(Integer.parseInt(review_number[0])+1);
                break;
            case "강원" :
                review_number[1] = String.valueOf(Integer.parseInt(review_number[1])+1);
                break;
            case "경북" :
                review_number[2] = String.valueOf(Integer.parseInt(review_number[2])+1);
                break;
            case "경남" :
                review_number[3] = String.valueOf(Integer.parseInt(review_number[3])+1);
                break;
            case "전북" :
                review_number[4] = String.valueOf(Integer.parseInt(review_number[4])+1);
                break;
            case "전남" :
                review_number[5] = String.valueOf(Integer.parseInt(review_number[5])+1);
                break;
            case "충북" :
                review_number[6] = String.valueOf(Integer.parseInt(review_number[6])+1);
                break;
            case "충남" :
                review_number[7] = String.valueOf(Integer.parseInt(review_number[7])+1);
                break;

        }
        return review_number;
    }

    //DB에 스트링으로 저장하기 때문에 리스트를 스트링버퍼로 전환해주는 함수
    public StringBuffer review_number_list_tostring(String[] review_number){
        StringBuffer review_number_sb = new StringBuffer();
        for(int i = 0; i < review_number.length; ++i) {
            if(i == review_number.length-1)
                review_number_sb.append(review_number[i]);
            else
                review_number_sb.append(review_number[i]+" ");
        }
        return review_number_sb;
    }
}