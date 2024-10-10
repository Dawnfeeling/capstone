package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_jeonnam extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_jeonnam);

        ImageView jnmarker1 = findViewById(R.id.jnmarker1);
        ImageView jnmarker2 = findViewById(R.id.jnmarker2);
        Button jnbutton1 = findViewById(R.id.jnbutton1);
        Button jnbutton1_2 = findViewById(R.id.jnbutton1_2);
        Button jnbutton2=findViewById(R.id.jnbutton2);

        ImageView jnmarker3 = findViewById(R.id.jnmarker3);
        Button jnbutton3 = findViewById(R.id.jnbutton3);
        ImageView jnmarker4 = findViewById(R.id.jnmarker4);
        Button jnbutton4 = findViewById(R.id.jnbutton4);
        ImageView jnmarker5 = findViewById(R.id.jnmarker5);
        Button jnbutton5 = findViewById(R.id.jnbutton5);
        ImageView jnmarker6 = findViewById(R.id.jnmarker6);
        Button jnbutton6 = findViewById(R.id.jnbutton6);
        ImageView jnmarker7 = findViewById(R.id.jnmarker7);
        Button jnbutton7 = findViewById(R.id.jnbutton7);
        ImageView jnmarker8 = findViewById(R.id.jnmarker8);
        Button jnbutton8 = findViewById(R.id.jnbutton8);

        jnmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton1.getVisibility()==View.INVISIBLE){
                    jnbutton1.setVisibility(View.VISIBLE);
                    jnbutton1_2.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton1.setVisibility(View.INVISIBLE);
                    jnbutton1_2.setVisibility(View.INVISIBLE);
                }
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);

            }
        });
        jnmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton2.getVisibility()==View.INVISIBLE){
                    jnbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton2.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);

            }
        });
        jnbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","담양 죽력고");
                startActivity(intent);
            }
        });
        jnbutton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","추성주");
                startActivity(intent);
            }
        });
        jnbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","편백숲 산소막걸리 순수령");
                startActivity(intent);
            }
        });


        jnmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton3.getVisibility()==View.INVISIBLE){
                    jnbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton3.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","진도 백주");
                startActivity(intent);
            }
        });

        jnmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton4.getVisibility()==View.INVISIBLE){
                    jnbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton4.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","시향가 탁주");
                startActivity(intent);
            }
        });

        jnmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton5.getVisibility()==View.INVISIBLE){
                    jnbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton5.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","낙안읍성");
                startActivity(intent);
            }
        });
        jnmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton6.getVisibility()==View.INVISIBLE){
                    jnbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton6.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","나주배 약주");
                startActivity(intent);
            }
        });
        jnmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton7.getVisibility()==View.INVISIBLE){
                    jnbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton7.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
                jnbutton8.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","금오도 방풍막걸리");
                startActivity(intent);
            }
        });
        jnmarker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jnbutton8.getVisibility()==View.INVISIBLE){
                    jnbutton8.setVisibility(View.VISIBLE);
                }
                else{
                    jnbutton8.setVisibility(View.INVISIBLE);
                }
                jnbutton1.setVisibility(View.INVISIBLE);
                jnbutton1_2.setVisibility(View.INVISIBLE);
                jnbutton2.setVisibility(View.INVISIBLE);
                jnbutton3.setVisibility(View.INVISIBLE);
                jnbutton5.setVisibility(View.INVISIBLE);
                jnbutton6.setVisibility(View.INVISIBLE);
                jnbutton7.setVisibility(View.INVISIBLE);
                jnbutton4.setVisibility(View.INVISIBLE);
            }
        });
        jnbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","해창 생막걸리");
                startActivity(intent);
            }
        });
    }
}