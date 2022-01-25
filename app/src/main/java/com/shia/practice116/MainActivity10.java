package com.shia.practice116;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity10 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbarDrawer2;
    DrawerLayout drawer2;
    NavigationView navigation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        toolbarDrawer2 = findViewById(R.id.toolbarDrawer2);
        setSupportActionBar(toolbarDrawer2);

        drawer2 = findViewById(R.id.drawer2);
        navigation2 = findViewById(R.id.navigation2);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer2, toolbarDrawer2, R.string.open, R.string.close);
        drawer2.addDrawerListener(toggle);
        toggle.syncState();

        navigation2.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.drawerItem1:
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.add(R.id.frameDrawer2 , new BottomFragment1());
                transaction1.addToBackStack(null);
                transaction1.commit();
                break;
            case R.id.drawerItem2:
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.frameDrawer2 , new BottomFragment2());
                transaction2.addToBackStack(null);
                transaction2.commit();
                break;
            case R.id.drawerItem3:
                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                transaction3.replace(R.id.frameDrawer2 , new BottomFragment3());
                transaction3.addToBackStack(null);
                transaction3.commit();
                break;
        }
        drawer2.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer2.isDrawerOpen(GravityCompat.START)){
            drawer2.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}