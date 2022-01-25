package com.shia.practice116;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity8 extends AppCompatActivity {

    TabLayout tabLayout1;
    ViewPager2 viewPager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        tabLayout1 = findViewById(R.id.tabLayout1);
        viewPager1 = findViewById(R.id.viewPager1);

        SliderAdapter1 sliderAdapter1 = new SliderAdapter1(this);
        viewPager1.setAdapter(sliderAdapter1);
        viewPager1.setOrientation(viewPager1.ORIENTATION_HORIZONTAL);
        viewPager1.setCurrentItem(1);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout1, viewPager1, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("0");
                        break;
                    case 1:
                        tab.setText("1");
                        break;
                    case 2:
                        tab.setText("2");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}