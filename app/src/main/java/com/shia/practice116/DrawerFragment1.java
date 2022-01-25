package com.shia.practice116;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class DrawerFragment1 extends Fragment {

    Toolbar toolbarDrawer1;
    DrawerLayout drawer1;
    NavigationView navigation1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drawer1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        toolbarDrawer1 = view.findViewById(R.id.toolbarDrawer1);

        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbarDrawer1);

        drawer1 = view.findViewById(R.id.drawer1);
        navigation1 = view.findViewById(R.id.navigation1);

        ActionBarDrawerToggle toggle1 = new ActionBarDrawerToggle(getActivity(), drawer1, toolbarDrawer1, R.string.open, R.string.close);
        drawer1.addDrawerListener(toggle1);
        toggle1.syncState();

        navigation1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.drawerItem1:
                    FragmentTransaction transaction1 = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.frameDrawer, new BottomFragment1());
                    transaction1.addToBackStack(null);
                    transaction1.commit();
                    break;
                    case R.id.drawerItem2:
                        FragmentTransaction transaction2 = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.frameDrawer, new BottomFragment2());
                        transaction2.addToBackStack(null);
                        transaction2.commit();
                        break;
                    case R.id.drawerItem3:
                        FragmentTransaction transaction3 = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.frameDrawer, new BottomFragment3());
                        transaction3.addToBackStack(null);
                        transaction3.commit();
                        break;
                }
                drawer1.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
    /*@Override
    public void onBackPressed(){
        if (drawer1.isDrawerOpen(GravityCompat.START)){
            drawer1.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }*/
}
