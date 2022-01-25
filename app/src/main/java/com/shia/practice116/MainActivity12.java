package com.shia.practice116;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity12 extends AppCompatActivity {

    /*Toolbar toolbarViewPager2;
    BottomNavigationView bottomNavigationView3;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        /*toolbarViewPager2 = findViewById(R.id.toolbarViewPager2);
        setSupportActionBar(toolbarViewPager2);

        bottomNavigationView3 = findViewById(R.id.bottomNavigationView3);*/

        /*FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameViewPager2, new BottomViewFragment());
        transaction.commit();*/

        /*bottomNavigationView3.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.frameViewPager2, new BottomFragment4());
                        transaction1.commit();
                        break;
                    case R.id.sitting:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frameViewPager2, new BottomFragment5());
                        transaction2.commit();
                        break;
                    case R.id.profile:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frameViewPager2, new BottomFragment6());
                        transaction3.commit();
                        break;
                }
                return true;
            }
        });
        bottomNavigationView3.setSelectedItemId(R.id.home);
        bottomNavigationView3.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
            }
        });*/
    }
}