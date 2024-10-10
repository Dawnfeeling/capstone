package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_jeonbuk extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_jeonbuk);

        ImageView jbmarker1=findViewById(R.id.jbmarker1);
        ImageView jbmarker2=findViewById(R.id.jbmarker2);
        Button jbbutton1=findViewById(R.id.jbbutton1);
        Button jbbutton2=findViewById(R.id.jbbutton2);
        Button jbbutton1_2=findViewById(R.id.jbbutton1_2);

        ImageView jbmarker4=findViewById(R.id.jbmarker4);
        Button jbbutton4=findViewById(R.id.jbbutton4);

        ImageView jbmarker5=findViewById(R.id.jbmarker5);
        Button jbbutton5=findViewById(R.id.jbbutton5);

        ImageView jbmarker6=findViewById(R.id.jbmarker6);
        Button jbbutton6=findViewById(R.id.jbbutton6);

        ImageView jbmarker7=findViewById(R.id.jbmarker7);
        Button jbbutton7=findViewById(R.id.jbbutton7);

        jbmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton1.getVisibility()==View.INVISIBLE){
                    jbbutton1.setVisibility(View.VISIBLE);
                    jbbutton1_2.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton1.setVisibility(View.INVISIBLE);
                    jbbutton1_2.setVisibility(View.INVISIBLE);
                }
                jbbutton2.setVisibility(View.INVISIBLE);
                jbbutton4.setVisibility(View.INVISIBLE);
                jbbutton5.setVisibility(View.INVISIBLE);
                jbbutton6.setVisibility(View.INVISIBLE);
                jbbutton7.setVisibility(View.INVISIBLE);
            }
        });
        jbmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton2.getVisibility()==View.INVISIBLE){
                    jbbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton2.setVisibility(View.INVISIBLE);
                }
                jbbutton1.setVisibility(View.INVISIBLE);
                jbbutton1_2.setVisibility(View.INVISIBLE);
                jbbutton4.setVisibility(View.INVISIBLE);
                jbbutton5.setVisibility(View.INVISIBLE);
                jbbutton6.setVisibility(View.INVISIBLE);
                jbbutton7.setVisibility(View.INVISIBLE);
            }
        });
        jbbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","고창 선운산땡큐 블루베리주");
                startActivity(intent);
            }
        });
        jbbutton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","꽃빛서리");
                startActivity(intent);
            }
        });
        jbbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","모리");
                startActivity(intent);
            }
        });

        jbmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton4.getVisibility()==View.INVISIBLE){
                    jbbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton4.setVisibility(View.INVISIBLE);
                }
                jbbutton1_2.setVisibility(View.INVISIBLE);
                jbbutton1.setVisibility(View.INVISIBLE);
                jbbutton2.setVisibility(View.INVISIBLE);
                jbbutton5.setVisibility(View.INVISIBLE);
                jbbutton6.setVisibility(View.INVISIBLE);
                jbbutton7.setVisibility(View.INVISIBLE);

            }
        });
        jbbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","참주가 서해밤바다");
                startActivity(intent);
            }
        });
        jbmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton5.getVisibility()==View.INVISIBLE){
                    jbbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton5.setVisibility(View.INVISIBLE);
                }
                jbbutton1.setVisibility(View.INVISIBLE);
                jbbutton1_2.setVisibility(View.INVISIBLE);
                jbbutton4.setVisibility(View.INVISIBLE);
                jbbutton2.setVisibility(View.INVISIBLE);
                jbbutton6.setVisibility(View.INVISIBLE);
                jbbutton7.setVisibility(View.INVISIBLE);
            }
        });
        jbmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton6.getVisibility()==View.INVISIBLE){
                    jbbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton6.setVisibility(View.INVISIBLE);
                }
                jbbutton1_2.setVisibility(View.INVISIBLE);
                jbbutton1.setVisibility(View.INVISIBLE);
                jbbutton2.setVisibility(View.INVISIBLE);
                jbbutton5.setVisibility(View.INVISIBLE);
                jbbutton4.setVisibility(View.INVISIBLE);
                jbbutton7.setVisibility(View.INVISIBLE);

            }
        });
        jbmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jbbutton7.getVisibility()==View.INVISIBLE){
                    jbbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    jbbutton7.setVisibility(View.INVISIBLE);
                }
                jbbutton1_2.setVisibility(View.INVISIBLE);
                jbbutton1.setVisibility(View.INVISIBLE);
                jbbutton2.setVisibility(View.INVISIBLE);
                jbbutton5.setVisibility(View.INVISIBLE);
                jbbutton6.setVisibility(View.INVISIBLE);
                jbbutton4.setVisibility(View.INVISIBLE);

            }
        });
        jbbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","진안블랙");
                startActivity(intent);
            }
        });
        jbbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","이강주 25");
                startActivity(intent);
            }
        });
        jbbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","밤빛머루");
                startActivity(intent);
            }
        });
    }
}