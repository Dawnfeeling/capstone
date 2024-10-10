package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class page extends AppCompatActivity{
    ArrayList<listviewitem> itemList = new ArrayList<listviewitem>();
    private FirebaseDatabase mDatabase;
    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        String path=getIntent().getStringExtra("name");
        mDatabase=FirebaseDatabase.getInstance();
        databaseReference = mDatabase.getReference("전통주").child(path);
        TextView nametxt=(TextView)findViewById(R.id.nametxt);
        TextView typeTxt=(TextView)findViewById(R.id.typeTxt);
        TextView regionTxt=findViewById(R.id.regionTxt);
        TextView mttxt=(TextView) findViewById(R.id.mttxt);
        TextView descTxt=(TextView) findViewById(R.id.descTxt);
        TextView infoTxt=(TextView) findViewById(R.id.infoTxt);
        TextView brewnameTxt=(TextView) findViewById(R.id.brewnameTxt);
        TextView brewTxt=(TextView) findViewById(R.id.brewTxt);
        ImageView imageView=(ImageView)findViewById(R.id.image);
        Button button_read=(Button)findViewById(R.id.review_read);

        button_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(page.this,Reviewpage.class);
                a.putExtra("key",nametxt.getText());
                startActivity(a);
            }
        });

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                nametxt.setText(snapshot.child("이름").getValue(String.class));
                descTxt.setText("도수 : "+String.valueOf(snapshot.child("도수").getValue(int.class))+
                        "% / 용량 : "+String.valueOf(snapshot.child("용량").getValue(int.class))+"ml");
                regionTxt.setText("지역 : "+snapshot.child("지역").getValue(String.class));
                mttxt.setText("재료 : "+snapshot.child("재료").getValue(String.class));
                typeTxt.setText("종류 : "+snapshot.child("종류").getValue(String.class));
                infoTxt.setText("소개"+System.lineSeparator()+snapshot.child("정보").getValue(String.class));
                brewnameTxt.setText("양조장 이름 : "+snapshot.child("양조장이름").getValue(String.class));
                brewTxt.setText("양조장 위치 : "+snapshot.child("양조장위치").getValue(String.class));
                Glide.with(page.this)
                        .load(snapshot.child("사진").getValue())
                        .into(imageView);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}