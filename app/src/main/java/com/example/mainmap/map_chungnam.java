package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_chungnam extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_chungnam);

        ImageView cnmarker1 = findViewById(R.id.cnmarker1);
        ImageView cnmarker2 = findViewById(R.id.cnmarker2);
        ImageView cnmarker3 = findViewById(R.id.cnmarker3);
        ImageView cnmarker4 = findViewById(R.id.cnmarker4);
        ImageView cnmarker5 = findViewById(R.id.cnmarker5);
        ImageView cnmarker6 = findViewById(R.id.cnmarker6);
        ImageView cnmarker7 = findViewById(R.id.cnmarker7);
        Button cnbutton1 = findViewById(R.id.cnbutton1);
        Button cnbutton2 = findViewById(R.id.cnbutton2);
        Button cnbutton2_2 = findViewById(R.id.cnbutton2_2);
        Button cnbutton3 = findViewById(R.id.cnbutton3);
        Button cnbutton4 = findViewById(R.id.cnbutton4);
        Button cnbutton5 = findViewById(R.id.cnbutton5);
        Button cnbutton6 = findViewById(R.id.cnbutton6);
        Button cnbutton7 = findViewById(R.id.cnbutton7);

        cnmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton1.getVisibility()==View.INVISIBLE){
                    cnbutton1.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton1.setVisibility(View.INVISIBLE);
                }
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton2.getVisibility()==View.INVISIBLE){
                    cnbutton2.setVisibility(View.VISIBLE);
                    cnbutton2_2.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton2.setVisibility(View.INVISIBLE);
                    cnbutton2_2.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton3.getVisibility()==View.INVISIBLE){
                    cnbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton3.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton4.getVisibility()==View.INVISIBLE){
                    cnbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton4.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton5.getVisibility()==View.INVISIBLE){
                    cnbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton5.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton6.getVisibility()==View.INVISIBLE){
                    cnbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton6.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton7.setVisibility(View.INVISIBLE);
            }
        });
        cnmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnbutton7.getVisibility()==View.INVISIBLE){
                    cnbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    cnbutton7.setVisibility(View.INVISIBLE);
                }
                cnbutton1.setVisibility(View.INVISIBLE);
                cnbutton2.setVisibility(View.INVISIBLE);
                cnbutton2_2.setVisibility(View.INVISIBLE);
                cnbutton3.setVisibility(View.INVISIBLE);
                cnbutton4.setVisibility(View.INVISIBLE);
                cnbutton5.setVisibility(View.INVISIBLE);
                cnbutton6.setVisibility(View.INVISIBLE);
            }
        });
        cnbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","추사 애플와인");
                startActivity(intent);
            }
        });
        cnbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","매화깊은밤");
                startActivity(intent);
            }
        });
        cnbutton2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","화백");
                startActivity(intent);
            }
        });
        cnbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","양촌 우렁이 쌀 청주");
                startActivity(intent);
            }
        });
        cnbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","금설");
                startActivity(intent);
            }
        });
        cnbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","술공방");
                startActivity(intent);
            }
        });
        cnbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","금이산 복숭아와인");
                startActivity(intent);
            }
        });
        cnbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","석로주");
                startActivity(intent);
            }
        });
    }
}