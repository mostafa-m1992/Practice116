package com.shia.practice116;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setSupportActionBar(findViewById(R.id.toolbar));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Page2").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page3").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page4").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page5").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page6").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page7").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page8").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page9").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(intent1);
                return false;
            }
        });
        menu.add("Page10").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(intent1);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}