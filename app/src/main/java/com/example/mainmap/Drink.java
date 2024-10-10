package com.example.mainmap;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Drink extends Fragment {
    private Button see_my_drink, add_my_drink;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_drink, container, false);

        see_my_drink = rootView.findViewById(R.id.see_my_drink);
        add_my_drink = rootView.findViewById(R.id.add_my_drink);

        see_my_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), stamp_page.class);
                startActivity(intent);
            }
        });

        add_my_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TextRecognition.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}