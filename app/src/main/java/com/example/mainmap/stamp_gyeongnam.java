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

public class stamp_gyeongnam extends Fragment implements View.OnClickListener {
    private FirebaseDatabase firebasedatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebasedatabase.getReference();
    ImageView gyeongnam_stamp;
    String uid, review_number_gyeongnam;
    String[] review_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.stamp_gyeongnam, container, false);
        gyeongnam_stamp = rootView.findViewById(R.id.gyeongnam_stamp);
        gyeongnam_stamp.setVisibility(View.INVISIBLE);

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
                    review_number_gyeongnam = review_number[3];
                    if(Integer.parseInt(review_number_gyeongnam) > 1)
                        gyeongnam_stamp.setVisibility(View.VISIBLE);
                    Log.d("firebase", review_number_gyeongnam);
                }
            }
        });

        gyeongnam_stamp.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        Intent intent = new Intent(getActivity() , my_review_drink.class);
        Bundle bundle = new Bundle();
        intent.putExtra("key","경남");
        bundle.putString("key", "경남");
        startActivity(intent);
    }
}