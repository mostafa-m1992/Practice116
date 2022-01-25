package com.shia.practice116;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity7 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.add(R.id.frameBottom, new BottomFragment1());
                        transaction1.commit();
                        break;
                    case R.id.sitting:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.add(R.id.frameBottom, new BottomFragment2());
                        transaction2.commit();
                        break;
                    case R.id.profile:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.add(R.id.frameBottom, new BottomFragment3());
                        transaction3.commit();
                        break;
                }
                //return true is for changing color of items when we select them. but "false" is for don't change
                return true;
            }
        });

        //setting on item as selected in first look
        bottomNavigationView.setSelectedItemId(R.id.home);

        //setting this code will help to don't refresh page
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });
    }
}