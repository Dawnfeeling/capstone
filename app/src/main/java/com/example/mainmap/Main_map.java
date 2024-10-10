package com.example.mainmap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Main_map extends Fragment {

    private ImageView gyeonggi;
    private ImageView gangwon;
    private ImageView chungcheongbuk;
    private ImageView chungcheongnam;
    private ImageView gyeongsangbuk;
    private ImageView gyeongsangnam;
    private ImageView jeollabuk;
    private ImageView jeollanam;
    private ImageView jeju;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_map, container, false);

        gyeonggi = rootView.findViewById(R.id.ggmarker);
        gangwon = rootView.findViewById(R.id.gwmarker);
        chungcheongbuk = rootView.findViewById(R.id.cbmarker);
        chungcheongnam = rootView.findViewById(R.id.cnmarker);
        gyeongsangbuk = rootView.findViewById(R.id.gbmarker);
        gyeongsangnam = rootView.findViewById(R.id.gnmarker);
        jeollabuk = rootView.findViewById(R.id.jbmarker);
        jeollanam = rootView.findViewById(R.id.jnmarker);
        jeju = rootView.findViewById(R.id.jjmarker);

        gyeonggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_gyenggi.class);
                startActivity(intent);
            }
        });

        gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_gangwon.class);
                startActivity(intent);
            }
        });

        chungcheongbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_chungbuk.class);
                startActivity(intent);
            }
        });

        chungcheongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_chungnam.class);
                startActivity(intent);
            }
        });

        gyeongsangbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_gyeongbuk.class);
                startActivity(intent);
            }
        });

        gyeongsangnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_gyeongnam.class);
                startActivity(intent);
            }
        });

        jeollabuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_jeonbuk.class);
                startActivity(intent);
            }
        });

        jeollanam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), map_jeonnam.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}