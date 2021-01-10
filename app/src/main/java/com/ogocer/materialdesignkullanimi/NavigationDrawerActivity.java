package com.ogocer.materialdesignkullanimi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private Toolbar toolbarNavView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        navigationView = findViewById(R.id.navigationView);
        toolbarNavView = findViewById(R.id.toolbarNavView);
        drawerLayout = findViewById(R.id.drawerLayout);

        setSupportActionBar(toolbarNavView);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbarNavView,0,0);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
}