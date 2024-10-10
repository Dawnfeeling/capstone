package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_gyeongbuk extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_gyeongbuk);

        ImageView gbmarker1=findViewById(R.id.gbmarker1);
        ImageView gbmarker2=findViewById(R.id.gbmarker2);
        ImageView gbmarker3=findViewById(R.id.gbmarker3);
        ImageView gbmarker4=findViewById(R.id.gbmarker4);
        ImageView gbmarker5=findViewById(R.id.gbmarker5);
        ImageView gbmarker6=findViewById(R.id.gbmarker6);
        ImageView gbmarker7=findViewById(R.id.gbmarker7);
        ImageView gbmarker8=findViewById(R.id.gbmarker8);
        Button gbbutton1=findViewById(R.id.gbbutton1);
        Button gbbutton2=findViewById(R.id.gbbutton2);
        Button gbbutton3=findViewById(R.id.gbbutton3);
        Button gbbutton4=findViewById(R.id.gbbutton4);
        Button gbbutton5=findViewById(R.id.gbbutton5);
        Button gbbutton6=findViewById(R.id.gbbutton6);
        Button gbbutton7=findViewById(R.id.gbbutton7);
        Button gbbutton8=findViewById(R.id.gbbutton8);

        gbmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton1.getVisibility()==View.INVISIBLE){
                    gbbutton1.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton1.setVisibility(View.INVISIBLE);
                }
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton2.getVisibility()==View.INVISIBLE){
                    gbbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton2.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton3.getVisibility()==View.INVISIBLE){
                    gbbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton3.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton4.getVisibility()==View.INVISIBLE){
                    gbbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton4.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton5.getVisibility()==View.INVISIBLE){
                    gbbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton5.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton6.getVisibility()==View.INVISIBLE){
                    gbbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton6.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton7.getVisibility()==View.INVISIBLE){
                    gbbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton7.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
                gbbutton8.setVisibility(View.INVISIBLE);
            }
        });
        gbmarker8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gbbutton8.getVisibility()==View.INVISIBLE){
                    gbbutton8.setVisibility(View.VISIBLE);
                }
                else{
                    gbbutton8.setVisibility(View.INVISIBLE);
                }
                gbbutton1.setVisibility(View.INVISIBLE);
                gbbutton2.setVisibility(View.INVISIBLE);
                gbbutton4.setVisibility(View.INVISIBLE);
                gbbutton3.setVisibility(View.INVISIBLE);
                gbbutton6.setVisibility(View.INVISIBLE);
                gbbutton7.setVisibility(View.INVISIBLE);
                gbbutton5.setVisibility(View.INVISIBLE);
            }
        });
        gbbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","경주교동법주");
                startActivity(intent);
            }
        });
        gbbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","맑은 문희주");
                startActivity(intent);
            }
        });
        gbbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","금과명주");
                startActivity(intent);
            }
        });
        gbbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","안동진맥소주");
                startActivity(intent);
            }
        });
        gbbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","소월미주");
                startActivity(intent);
            }
        });
        gbbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","예천주 만월");
                startActivity(intent);
            }
        });
        gbbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","벼리");
                startActivity(intent);
            }
        });
        gbbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","엄청주");
                startActivity(intent);
            }
        });
    }
}
