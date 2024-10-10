package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class stamp_page extends AppCompatActivity {

    private ViewPager2 mviewPager2;
    private TabLayout mtabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stamp_page);

        mtabLayout = findViewById(R.id.tablayout);
        mviewPager2 = findViewById(R.id.viewpager);

        stamp_Adapter mpagerAdapter = new stamp_Adapter(this);
        mviewPager2.setAdapter(mpagerAdapter);

        final List<String> tabElement = Arrays.asList("경기", "강원", "경북", "경남", "전북", "전남", "충북", "충남");

        //tablayout과 viewpager연결
        new TabLayoutMediator(mtabLayout, mviewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                TextView textView = new TextView(stamp_page.this);
                textView.setText(tabElement.get(position));
                textView.setGravity(Gravity.CENTER);
                textView.setTextSize(13);
                textView.setTypeface(null, Typeface.BOLD);
                textView.setTypeface(Typeface.createFromAsset(getAssets(), "font_2/wolin.TTF"));
                tab.setCustomView(textView);
            }
        }).attach();
    }
}