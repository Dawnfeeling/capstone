package com.example.mainmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private final long finishtime = 2500;  //뒤로가기버튼을 2.5초 이내에 다시 눌러야 종료
    private long presstime = 0;

    Main_map mainmap;
    Main_category category;
    Drink drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        mainmap = new Main_map();
        category = new Main_category();
        drink = new Drink();

        getSupportFragmentManager().beginTransaction().replace(R.id.containers, category).commit();

        NavigationBarView navigationBarView = findViewById(R.id.Smenu);
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, category).commit();
                        return true;
                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, mainmap).commit();
                        return true;
                    case R.id.tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, drink).commit();
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed(){
        long temptime = System.currentTimeMillis();
        long intervaltime = temptime - presstime;

        if(0 <= intervaltime && finishtime >= intervaltime){
            finish();
        }
        else{
            presstime = temptime;
            Toast.makeText(getApplicationContext(), "한번더 누르시면 앱이 종료됩니다", Toast.LENGTH_LONG).show();
        }
    }
}