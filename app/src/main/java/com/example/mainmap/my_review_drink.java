package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class my_review_drink extends AppCompatActivity {
    ListView my_review_list ;
    Adapter adapter;
    private ArrayList<listviewitem> itemList;
    ArrayList<String> my_drink_names = new ArrayList<>();
    private String uid = null;
    private FirebaseDatabase mDatabase;
    private DatabaseReference databaseReference_Customer;
    private DatabaseReference databaseReference_Drink;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_review_drink);

        ArrayList<listviewitem> itemList = new ArrayList<listviewitem>();
        // 리스트뷰 참조 및 Adapter달기
        my_review_list = (ListView) findViewById(R.id.my_review_list);
        // Adapter 생성
        adapter = new Adapter(itemList) ;
        my_review_list.setAdapter(adapter);
        mDatabase=FirebaseDatabase.getInstance();

        //UID
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();  //현재로그인한 아이디

        String area=getIntent().getStringExtra("key");

        databaseReference_Customer = mDatabase.getReference("고객").child(uid);// 변경값을 확인할 child 이름
        databaseReference_Customer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot messageData : snapshot.getChildren()) {
                    String drink_name= messageData.child("drink_name").getValue(String.class);
                    my_drink_names.add(drink_name);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        databaseReference_Drink = mDatabase.getReference("전통주");// 변경값을 확인할 child 이름
        databaseReference_Drink.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot messageData : snapshot.getChildren()) {
                    String drink_area=messageData.child("지역").getValue(String.class);
                    String drink_name=messageData.child("이름").getValue(String.class);
                    String[] drink_area_split = drink_area.split(" ");

                    if(area.equals(drink_area_split[0]) && my_drink_names.contains(drink_name)) {
                        String icon=messageData.child("사진").getValue(String.class);
                        int id=(int) messageData.child("도수").getValue(int.class);
                        int ml=messageData.child("용량").getValue(int.class);
                        String type=messageData.child("종류").getValue(String.class);
                        float rating= messageData.child("별점").getValue(float.class);
                        adapter.addItem(drink_name,icon,id,type,drink_area,ml,rating);
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        my_review_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listviewitem item = (listviewitem) adapterView.getItemAtPosition(i) ;
                Intent intent=new Intent(my_review_drink.this, page.class);
                String titleStr = item.getTitle() ;
                intent.putExtra("name",titleStr);
                startActivity(intent);
            }
        });
    }
}