package com.example.mainmap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class map_gyenggi extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_gyenggi);

        ImageView ggmarker1 = findViewById(R.id.ggmarker1);
        ImageView ggmarker2 = findViewById(R.id.ggmarker2);
        ImageView ggmarker3 = findViewById(R.id.ggmarker3);
        ImageView ggmarker4 = findViewById(R.id.ggmarker4);
        ImageView ggmarker5 = findViewById(R.id.ggmarker5);
        ImageView ggmarker6 = findViewById(R.id.ggmarker6);
        ImageView ggmarker7 = findViewById(R.id.ggmarker7);
        ImageView ggmarker8 = findViewById(R.id.ggmarker8);
        ImageView ggmarker9 = findViewById(R.id.ggmarker9);
        ImageView ggmarker10 = findViewById(R.id.ggmarker10);
        ImageView ggmarker11 = findViewById(R.id.ggmarker11);
        ImageView ggmarker12 = findViewById(R.id.ggmarker12);
        ImageView ggmarker13 = findViewById(R.id.ggmarker13);
        ImageView ggmarker14 = findViewById(R.id.ggmarker14);
        Button ggbutton1 = findViewById(R.id.ggbutton1);
        Button ggbutton2 = findViewById(R.id.ggbutton2);
        Button ggbutton3 = findViewById(R.id.ggbutton3);
        Button ggbutton3_2 = findViewById(R.id.ggbutton3_2);
        Button ggbutton4 = findViewById(R.id.ggbutton4);
        Button ggbutton5 = findViewById(R.id.ggbutton5);
        Button ggbutton6 = findViewById(R.id.ggbutton6);
        Button ggbutton7 = findViewById(R.id.ggbutton7);
        Button ggbutton8 = findViewById(R.id.ggbutton8);
        Button ggbutton9 = findViewById(R.id.ggbutton9);
        Button ggbutton10= findViewById(R.id.ggbutton10);
        Button ggbutton11= findViewById(R.id.ggbutton11);
        Button ggbutton12= findViewById(R.id.ggbutton12);
        Button ggbutton13= findViewById(R.id.ggbutton13);
        Button ggbutton14= findViewById(R.id.ggbutton14);

        ggmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton1.getVisibility()==View.INVISIBLE){
                    ggbutton1.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton1.setVisibility(View.INVISIBLE);
                }
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton2.getVisibility()==View.INVISIBLE){
                    ggbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton2.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton3.getVisibility()==View.INVISIBLE){
                    ggbutton3.setVisibility(View.VISIBLE);
                    ggbutton3_2.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton3.setVisibility(View.INVISIBLE);
                    ggbutton3_2.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton4.getVisibility()==View.INVISIBLE){
                    ggbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton4.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton5.getVisibility()==View.INVISIBLE){
                    ggbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton5.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton6.getVisibility()==View.INVISIBLE){
                    ggbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton6.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton7.getVisibility()==View.INVISIBLE){
                    ggbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton7.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton8.getVisibility()==View.INVISIBLE){
                    ggbutton8.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton8.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton9.getVisibility()==View.INVISIBLE){
                    ggbutton9.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton9.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton10.getVisibility()==View.INVISIBLE){
                    ggbutton10.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton10.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton11.getVisibility()==View.INVISIBLE){
                    ggbutton11.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton11.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton12.getVisibility()==View.INVISIBLE){
                    ggbutton12.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton12.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton13.getVisibility()==View.INVISIBLE){
                    ggbutton13.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton13.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton14.setVisibility(View.INVISIBLE);
            }
        });
        ggmarker14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ggbutton14.getVisibility()==View.INVISIBLE){
                    ggbutton14.setVisibility(View.VISIBLE);
                }
                else{
                    ggbutton14.setVisibility(View.INVISIBLE);
                }
                ggbutton1.setVisibility(View.INVISIBLE);
                ggbutton2.setVisibility(View.INVISIBLE);
                ggbutton3.setVisibility(View.INVISIBLE);
                ggbutton3_2.setVisibility(View.INVISIBLE);
                ggbutton4.setVisibility(View.INVISIBLE);
                ggbutton5.setVisibility(View.INVISIBLE);
                ggbutton6.setVisibility(View.INVISIBLE);
                ggbutton7.setVisibility(View.INVISIBLE);
                ggbutton8.setVisibility(View.INVISIBLE);
                ggbutton9.setVisibility(View.INVISIBLE);
                ggbutton10.setVisibility(View.INVISIBLE);
                ggbutton11.setVisibility(View.INVISIBLE);
                ggbutton12.setVisibility(View.INVISIBLE);
                ggbutton13.setVisibility(View.INVISIBLE);
            }
        });
        ggbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","과천미주");
                startActivity(intent);
            }
        });
        ggbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","그랑꼬또 청수");
                startActivity(intent);
            }
        });
        ggbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","서울의밤");
                startActivity(intent);
            }
        });
        ggbutton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","연희민트");
                startActivity(intent);
            }
        });
        ggbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","연꽃담은술");
                startActivity(intent);
            }
        });
        ggbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","독산 30");
                startActivity(intent);
            }
        });
        ggbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","남한산성소주 21");
                startActivity(intent);
            }
        });
        ggbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","도래하");
                startActivity(intent);
            }
        });
        ggbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","별산오디 스파클링 막걸리");
                startActivity(intent);
            }
        });
        ggbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","빡치주");
                startActivity(intent);
            }
        });
        ggbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","복단지 350");
                startActivity(intent);
            }
        });
        ggbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","느린마을 막걸리");
                startActivity(intent);
            }
        });
        ggbutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","톡쏘는 옥수수동동");
                startActivity(intent);
            }
        });
        ggbutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","무주구천동산머루주");
                startActivity(intent);
            }
        });
        ggbutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","소성주");
                startActivity(intent);
            }
        });
    }
}
