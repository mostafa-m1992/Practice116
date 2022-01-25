package com.shia.practice116;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity11 extends AppCompatActivity {

    Toolbar toolbarViewPager1;
    TabLayout tabLayout2;
    ViewPager2 viewPager2;

    BottomNavigationView bottomNavigationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        toolbarViewPager1 = findViewById(R.id.toolbarViewPager1);
        setSupportActionBar(toolbarViewPager1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout2 = findViewById(R.id.tabLayout2);
        viewPager2 = findViewById(R.id.viewPager2);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);

        adapter.addFragment(new ViewFragment1());
        adapter.addFragment(new ViewFragment2());
        adapter.addFragment(new ViewFragment3());

        viewPager2.setAdapter(adapter);
        viewPager2.setCurrentItem(0);
        viewPager2.setOrientation(viewPager2.ORIENTATION_HORIZONTAL);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout2, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.frameViewPager1, new ViewFragment1());
                        transaction1.commit();
                        break;
                    case 1:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frameViewPager1, new ViewFragment2());
                        transaction2.commit();
                        break;
                    case 2:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frameViewPager1, new ViewFragment3());
                        transaction3.commit();
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

        tabLayout2.getTabAt(0).setIcon(R.drawable.ic_baseline_card);
        tabLayout2.getTabAt(1).setIcon(R.drawable.ic_baseline_card);
        tabLayout2.getTabAt(2).setIcon(R.drawable.ic_baseline_card);

        tabLayout2.getTabAt(0).setText("one");
        tabLayout2.getTabAt(1).setText("two");
        tabLayout2.getTabAt(2).setText("three");

        bottomNavigationView2 = findViewById(R.id.bottomNavigationView2);
        bottomNavigationView2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.frameViewPager1, new BottomFragment4());
                        transaction1.commit();
                        break;
                    case R.id.sitting:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frameViewPager1, new BottomFragment5());
                        transaction2.commit();
                        break;
                    case R.id.profile:
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frameViewPager1, new BottomFragment6());
                        transaction3.commit();
                        break;
                }
                return true;
            }
        });
        bottomNavigationView2.setSelectedItemId(R.id.home);
        bottomNavigationView2.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}