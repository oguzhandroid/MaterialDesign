package com.ogocer.materialdesignkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment geciciFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigationView = findViewById(R.id.bottomNav);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_tutucu,new FragmentBirinci()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.action_bir){
                    geciciFragment = new FragmentBirinci();
                }
                if (item.getItemId() == R.id.action_iki){
                    geciciFragment = new FragmentIkinci();
                }
                if (item.getItemId() == R.id.action_uc){
                    geciciFragment = new FragmentUcuncu();
                }

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_tutucu,geciciFragment).commit();
                return true;
            }
        });

    }



}