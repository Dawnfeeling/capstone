package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_chungbuk extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_chungbuk);

        ImageView cbmarker1 = findViewById(R.id.cbmarker1);
        ImageView cbmarker2 = findViewById(R.id.cbmarker2);
        ImageView cbmarker3 = findViewById(R.id.cbmarker3);
        ImageView cbmarker4 = findViewById(R.id.cbmarker4);
        ImageView cbmarker5 = findViewById(R.id.cbmarker5);
        Button cbbutton1 = findViewById(R.id.cbbutton1);
        Button cbbutton1_2 = findViewById(R.id.cbbutton1_2);
        Button cbbutton2 = findViewById(R.id.cbbutton2);
        Button cbbutton3 = findViewById(R.id.cbbutton3);
        Button cbbutton4 = findViewById(R.id.cbbutton4);
        Button cbbutton5 = findViewById(R.id.cbbutton5);

        cbmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbbutton1.getVisibility()==View.INVISIBLE){
                    cbbutton1.setVisibility(View.VISIBLE);
                    cbbutton1_2.setVisibility(View.VISIBLE);
                }
                else{
                    cbbutton1.setVisibility(View.INVISIBLE);
                    cbbutton1_2.setVisibility(View.INVISIBLE);
                }
                cbbutton2.setVisibility(View.INVISIBLE);
                cbbutton3.setVisibility(View.INVISIBLE);
                cbbutton4.setVisibility(View.INVISIBLE);
                cbbutton5.setVisibility(View.INVISIBLE);
            }
        });
        cbmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbbutton2.getVisibility()==View.INVISIBLE){
                    cbbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    cbbutton2.setVisibility(View.INVISIBLE);
                }
                cbbutton1.setVisibility(View.INVISIBLE);
                cbbutton1_2.setVisibility(View.INVISIBLE);
                cbbutton3.setVisibility(View.INVISIBLE);
                cbbutton4.setVisibility(View.INVISIBLE);
                cbbutton5.setVisibility(View.INVISIBLE);
            }
        });
        cbmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbbutton3.getVisibility()==View.INVISIBLE){
                    cbbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    cbbutton3.setVisibility(View.INVISIBLE);
                }
                cbbutton1.setVisibility(View.INVISIBLE);
                cbbutton1_2.setVisibility(View.INVISIBLE);
                cbbutton2.setVisibility(View.INVISIBLE);
                cbbutton4.setVisibility(View.INVISIBLE);
                cbbutton5.setVisibility(View.INVISIBLE);
            }
        });
        cbmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbbutton4.getVisibility()==View.INVISIBLE){
                    cbbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    cbbutton4.setVisibility(View.INVISIBLE);
                }
                cbbutton1.setVisibility(View.INVISIBLE);
                cbbutton1_2.setVisibility(View.INVISIBLE);
                cbbutton2.setVisibility(View.INVISIBLE);
                cbbutton3.setVisibility(View.INVISIBLE);
                cbbutton5.setVisibility(View.INVISIBLE);
            }
        });
        cbmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbbutton5.getVisibility()==View.INVISIBLE){
                    cbbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    cbbutton5.setVisibility(View.INVISIBLE);
                }
                cbbutton1.setVisibility(View.INVISIBLE);
                cbbutton1_2.setVisibility(View.INVISIBLE);
                cbbutton2.setVisibility(View.INVISIBLE);
                cbbutton3.setVisibility(View.INVISIBLE);
                cbbutton4.setVisibility(View.INVISIBLE);
            }
        });
        cbbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","선희주");
                startActivity(intent);
            }
        });
        cbbutton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","문앞에봄");
                startActivity(intent);
            }
        });
        cbbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","화몽");
                startActivity(intent);
            }
        });
        cbbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","괴산 세종 찰옥수수 전통주");
                startActivity(intent);
            }
        });
        cbbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","바나나주");
                startActivity(intent);
            }
        });
        cbbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","시인의마을");
                startActivity(intent);
            }
        });
    }
}
