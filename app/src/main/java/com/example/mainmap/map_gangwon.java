package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class map_gangwon extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_gangwon);

        ImageView gwmarker1 = findViewById(R.id.gwmarker1);
        ImageView gwmarker2 = findViewById(R.id.gwmarker2);
        ImageView gwmarker3 = findViewById(R.id.gwmarker3);
        ImageView gwmarker4 = findViewById(R.id.gwmarker4);
        ImageView gwmarker5 = findViewById(R.id.gwmarker5);
        ImageView gwmarker6 = findViewById(R.id.gwmarker6);
        ImageView gwmarker7 = findViewById(R.id.gwmarker7);
        Button gwbutton1 = findViewById(R.id.gwbutton1);
        Button gwbutton2 = findViewById(R.id.gwbutton2);
        Button gwbutton3 = findViewById(R.id.gwbutton3);
        Button gwbutton4 = findViewById(R.id.gwbutton4);
        Button gwbutton5 = findViewById(R.id.gwbutton5);
        Button gwbutton6 = findViewById(R.id.gwbutton6);
        Button gwbutton7 = findViewById(R.id.gwbutton7);

        gwmarker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton1.getVisibility()==View.INVISIBLE){
                    gwbutton1.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton1.setVisibility(View.INVISIBLE);
                }
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton2.getVisibility()==View.INVISIBLE){
                    gwbutton2.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton2.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton3.getVisibility()==View.INVISIBLE){
                    gwbutton3.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton3.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton4.getVisibility()==View.INVISIBLE){
                    gwbutton4.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton4.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton5.getVisibility()==View.INVISIBLE){
                    gwbutton5.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton5.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton6.getVisibility()==View.INVISIBLE){
                    gwbutton6.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton6.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton7.setVisibility(View.INVISIBLE);
            }
        });
        gwmarker7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gwbutton7.getVisibility()==View.INVISIBLE){
                    gwbutton7.setVisibility(View.VISIBLE);
                }
                else{
                    gwbutton7.setVisibility(View.INVISIBLE);
                }
                gwbutton1.setVisibility(View.INVISIBLE);
                gwbutton2.setVisibility(View.INVISIBLE);
                gwbutton3.setVisibility(View.INVISIBLE);
                gwbutton4.setVisibility(View.INVISIBLE);
                gwbutton5.setVisibility(View.INVISIBLE);
                gwbutton6.setVisibility(View.INVISIBLE);
            }
        });
        gwbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","백자주");
                startActivity(intent);
            }
        });
        gwbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","얼떨결에 퍼플");
                startActivity(intent);
            }
        });
        gwbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","동짓달 기나긴 밤");
                startActivity(intent);
            }
        });
        gwbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","1000억 유산균 막걸리");
                startActivity(intent);
            }
        });
        gwbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","평창 서주 감자술");
                startActivity(intent);
            }
        });
        gwbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","오대쌀로 빚은 우리청주");
                startActivity(intent);
            }
        });
        gwbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), page.class);
                intent.putExtra("name","양지백주");
                startActivity(intent);
            }
        });
    }
}
