package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Main_category extends Fragment {

    private ImageView all;
    private ImageView tacju;
    private ImageView cheongju;
    private ImageView guasilju;
    private ImageView gitaju;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_category, container, false);

        all = rootView.findViewById(R.id.all);
        tacju = rootView.findViewById(R.id.tacju);
        cheongju = rootView.findViewById(R.id.cheongju);
        guasilju = rootView.findViewById(R.id.guasilju);
        gitaju = rootView.findViewById(R.id.gitaju);
        Bundle bundle = new Bundle();

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), main_list.class);
                intent.putExtra("key","0");
                bundle.putString("key", "0");
                startActivity(intent);
            }
        });

        tacju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), main_list.class);
                intent.putExtra("key","1");
                bundle.putString("key", "1");
                startActivity(intent);
            }
        });

        cheongju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),  main_list.class);
                intent.putExtra("key","2");
                bundle.putString("key", "2");
                startActivity(intent);
            }
        });

        guasilju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),  main_list.class);
                intent.putExtra("key","3");
                bundle.putString("key", "3");
                startActivity(intent);
            }
        });

        gitaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), main_list.class);
                intent.putExtra("key","4");
                bundle.putString("key", "4");
                startActivity(intent);
            }
        });
        return rootView;
    }
}