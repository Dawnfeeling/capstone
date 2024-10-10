package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Reviewpage extends AppCompatActivity {
    ListView listview ;
    review_Adapter adapter;
    private ArrayList<listviewitem_review> itemList;
    private FirebaseDatabase mDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewpage);
        ArrayList<listviewitem_review> itemList = new ArrayList<listviewitem_review>();
        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview_review);
        // Adapter 생성
        adapter = new review_Adapter(itemList) ;
        listview.setAdapter(adapter);
        mDatabase=FirebaseDatabase.getInstance();

        String resultname=getIntent().getStringExtra("key");
        TextView textView=findViewById(R.id.nametxt);
        textView.setText(resultname);
        databaseReference = mDatabase.getReference("고객");// 변경값을 확인할 child 이름
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                double ratingavg=0; double i=0;
                for (DataSnapshot messageData : dataSnapshot.getChildren()) {
                    if(messageData.hasChild(resultname))
                    {String drink_name=messageData.child(resultname).child("drink_name").getValue(String.class);
                    String review_content = messageData.child(resultname).child("review_content").getValue(String.class);
                        String email = messageData.child(resultname).child("email").getValue(String.class);
                        float rating_value= messageData.child(resultname).child("rating_value").getValue(float.class);
                    ratingavg+=rating_value; i+=1;
                    adapter.addItem(drink_name,review_content,rating_value,email);}
                };
                if(i!=0&&ratingavg!=0){
                    double rating=Math.round((ratingavg/i));
                    rating_avg(rating);}
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ImageView imageView=findViewById(R.id.image);
        databaseReference=mDatabase.getReference("전통주").child(resultname);
        databaseReference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Activity activity = Reviewpage.this;
                if (activity.isFinishing())
                    return;
                Glide.with(Reviewpage.this)
                        .load(snapshot.child("사진").getValue())
                        .into(imageView);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void rating_avg(double rating_value){
        databaseReference.child("별점").setValue(rating_value);
    }
}