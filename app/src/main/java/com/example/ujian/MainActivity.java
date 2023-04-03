package com.example.ujian;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.navigation_home:
                                // Tampilkan halaman Home
                                return true;
                            case R.id.navigation_dashboard:
                                // Tampilkan halaman Dashboard
                                return true;
                            case R.id.navigation_notifications:
                                // Tampilkan halaman Notifications
                                return true;
                        }
                        return false;
                    }
                });
        TextView myTextView = (TextView) findViewById(R.id.my_text_view);
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondAct.class);
                startActivity(intent);
            }
        });

        TextView myTextView1 = (TextView) findViewById(R.id.my_text_view_2);
        myTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hal3.class);
                startActivity(intent);
            }
        });

        TextView myTextView2 = (TextView) findViewById(R.id.my_text_view_3);
        myTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hal3.class);
                startActivity(intent);
            }
        });

        TextView myTextView3 = (TextView) findViewById(R.id.my_text_view_4);
        myTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hal3.class);
                startActivity(intent);
            }
        });

    }

    private BottomNavigationView bottomNavigationView;


}
