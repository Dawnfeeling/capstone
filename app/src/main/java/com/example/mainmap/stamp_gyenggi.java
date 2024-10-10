package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class stamp_gyenggi extends Fragment implements View.OnClickListener {
    //파이어 베이스 DB연동
    private FirebaseDatabase firebasedatabase = FirebaseDatabase.getInstance();

    //DatabaseReference는 데이터베이스의 특정 위치로 연결하는 거라고 생각하면 된다.
    //현재 연결은 데이터베이스에만 딱 연결해놓고
    //키값(테이블 또는 속성)의 위치 까지는 들어가지는 않은 모습이다.
    private DatabaseReference databaseReference = firebasedatabase.getReference();
    ImageView gyenggi_stamp;
    String uid, review_number_gyenggi;
    String[] review_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.stamp_gyenggi, container, false);
        gyenggi_stamp = rootView.findViewById(R.id.gyenggi_stamp);
        gyenggi_stamp.setVisibility(View.INVISIBLE);

        //UID
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();  //현재로그인한 아이디
        //review_number
        databaseReference.child("고객").child(uid).child("리뷰개수").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    review_number = String.valueOf(task.getResult().getValue()).split(" ");
                    review_number_gyenggi = review_number[0];
                    if(Integer.parseInt(review_number_gyenggi) > 1)
                        gyenggi_stamp.setVisibility(View.VISIBLE);
                    Log.d("firebase", review_number_gyenggi);
                }
            }
        });

        gyenggi_stamp.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        Intent intent = new Intent(getActivity() , my_review_drink.class);
        Bundle bundle = new Bundle();
        intent.putExtra("key","경기");
        bundle.putString("key", "경기");
        startActivity(intent);
    }
}