package com.example.mainmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main_list extends AppCompatActivity {
    static int is_kind=0;
    Button sort_han;
    Button sort_per;
    Button sort_rank;
    ListView listview ;
    Adapter adapter;
    private ArrayList<listviewitem> itemList;
    private FirebaseDatabase mDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_list);

        sort_han = (Button) findViewById(R.id.sort_han);
        sort_per = findViewById(R.id.sort_per);
        sort_rank = findViewById(R.id.sort_rank);
        EditText editText=(EditText) findViewById(R.id.editTextTextPersonName);
        ArrayList<listviewitem> itemList = new ArrayList<listviewitem>();
        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview);
        // Adapter 생성
        adapter = new Adapter(itemList) ;
        listview.setAdapter(adapter);
        mDatabase=FirebaseDatabase.getInstance();

        String kind=getIntent().getStringExtra("key");

        databaseReference = mDatabase.getReference("전통주");// 변경값을 확인할 child 이름
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot messageData : dataSnapshot.getChildren()) {

                    String type=messageData.child("종류").getValue(String.class);

                    if (kind.equals("0")) {
                        is_kind=1;
                    } else if (kind.equals("1")) {
                        if (type.equals("탁주")) {
                            is_kind=1;
                        } else {
                            is_kind=0;
                        }
                    } else if (kind.equals("2")) {
                        if (type.equals("청주/약주")) {
                            is_kind=1;
                        } else {
                            is_kind=0;
                        }
                    } else if (kind.equals("3")) {
                        if (type.equals("과실주")) {
                            is_kind=1;
                        } else {
                            is_kind=0;
                        }
                    } else if (kind.equals("4")) {
                        if (type.equals("기타주류")) {
                            is_kind=1;
                        } else {
                            is_kind=0;
                        }
                    }

                    if (is_kind==1){
                        String icon=messageData.child("사진").getValue(String.class);
                        String name = (String) messageData.child("이름").getValue(String.class);
                        int id=(int) messageData.child("도수").getValue(int.class);
                        int ml=messageData.child("용량").getValue(int.class);
                        String region=messageData.child("지역").getValue(String.class);
                        float rating= messageData.child("별점").getValue(float.class);
                        adapter.addItem(name,icon,id,type,region,ml,rating);
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listviewitem item = (listviewitem) adapterView.getItemAtPosition(i) ;
                Intent intent=new Intent(main_list.this, page.class);
                String titleStr = item.getTitle() ;
                intent.putExtra("name",titleStr);
                startActivity(intent);
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                ((Adapter)listview.getAdapter()).getFilter().filter(filterText) ;
            }
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
        });

        sort_han.setOnClickListener(new View.OnClickListener() {
            boolean name=true;
            @Override
            public void onClick(View view) {
                Comparator<listviewitem> textDesc = new Comparator<listviewitem>() {
                    @Override
                    public int compare(listviewitem item1, listviewitem item2) {
                        if(name==false){
                            return item1.getTitle().compareTo(item2.getTitle());}
                        else{
                            return item2.getTitle().compareTo(item1.getTitle());}
                    }
                };
                if(name==false){name=true;}
                else{name=false;}
                Collections.sort(itemList, textDesc) ;
                adapter.notifyDataSetChanged() ;
            }
        });

        sort_per.setOnClickListener(new View.OnClickListener() {
            boolean abv=true; //alcohol by volume 도수표현
            @Override
            public void onClick(View view) {
                Comparator<listviewitem> abvDesc = new Comparator<listviewitem>() {
                    @Override
                    public int compare(listviewitem item1, listviewitem item2) {
                        if(abv ==false){

                            return (item1.getDosu() - item2.getDosu());}
                        else{
                            return (item2.getDosu() - item1.getDosu());}

                    }
                } ;
                if(abv==false){abv=true;}
                else{abv=false;}
                Collections.sort(itemList, abvDesc) ;
                adapter.notifyDataSetChanged() ;
            }
        });

        sort_rank.setOnClickListener(new View.OnClickListener() {
            boolean rating=true;
            @Override
            public void onClick(View view) {
                Comparator<listviewitem> ratingDesc = new Comparator<listviewitem>() {
                    @Override
                    public int compare(listviewitem item1, listviewitem item2) {
                        if(rating==false){
                            if (item1.getRating() > item2.getRating())
                                return 1;
                            else if (item1.getRating() < item2.getRating())
                                return -1;
                            else
                                return 0;
                        }
                        else{
                            if (item1.getRating() < item2.getRating())
                                return 1;
                            else if (item1.getRating() > item2.getRating())
                                return -1;
                            else
                                return 0;}
                    }
                } ;
                if(rating==false){rating=true;}
                else{rating=false;}
                Collections.sort(itemList, ratingDesc) ;
                adapter.notifyDataSetChanged() ;
            }
        });
    }
}