package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_gyeongnam extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_gyeongnam);

        ImageView gnmarker1=findViewById(R.id.gnmarker1);
        Button gnbutton1=findViewById(R.id.gnbutton1);

        ImageView gnmarker2=findViewById(R.id.gnmarker2);
        Button gnbutton2=findViewById(R.id.gnbutton2);

        ImageView gnmarker3=findViewById(R.id.gnmarker3);
        Button gnbutton3=findViewById(R.id.gnbutton3);

        ImageView gnmarker4=findViewById(R.id.gnmarker4);
        Button gnbutton4=findViewById(R.id.gnbutton4);

        ImageView gnmarker5=findViewById(R.id.gnmarker5);
        Button gnbutton5=findViewById(R.id.gnbutton5);

        ImageView gnmarker6=findViewById(R.id.gnmarker6);
        Button gnbutton6=findViewById(R.id.gnbutton6);

        ImageView gnmarker7=findViewById(R.id.gnmarker7);
        Button gnbutton7=findViewById(R.id.gnbutton7);

        gnmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton1.getVisibility()==View.INVISIBLE){
                    gnbutton1.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton1.setVisibility(View.INVISIBLE);
                }
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);
            }
        });

        gnbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","복순도가 탁주");
                startActivity(intent);
            }
        });

        gnmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton2.getVisibility()==View.INVISIBLE){
                    gnbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton2.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);
            }
        });

        gnbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","소풍");
                startActivity(intent);
            }
        });

        gnmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton3.getVisibility()==View.INVISIBLE){
                    gnbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton3.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);
            }
        });

        gnbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","감천막걸리");
                startActivity(intent);
            }
        });

        gnmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton4.getVisibility()==View.INVISIBLE){
                    gnbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton4.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);

            }
        });

        gnbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","사화정미소");
                startActivity(intent);
            }
        });

        gnmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton5.getVisibility()==View.INVISIBLE){
                    gnbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton5.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);

            }
        });

        gnbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","일월삼주 이주");
                startActivity(intent);
            }
        });

        gnmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton6.getVisibility()==View.INVISIBLE){
                    gnbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton6.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton7.setVisibility(View.INVISIBLE);

            }
        });

        gnbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","단감명작");
                startActivity(intent);
            }
        });

        gnmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gnbutton7.getVisibility()==View.INVISIBLE){
                    gnbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    gnbutton7.setVisibility(View.INVISIBLE);
                }
                gnbutton1.setVisibility(View.INVISIBLE);
                gnbutton2.setVisibility(View.INVISIBLE);
                gnbutton3.setVisibility(View.INVISIBLE);
                gnbutton4.setVisibility(View.INVISIBLE);
                gnbutton5.setVisibility(View.INVISIBLE);
                gnbutton6.setVisibility(View.INVISIBLE);

            }
        });

        gnbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","악양 막걸리");
                startActivity(intent);
            }
        });
    }
}
