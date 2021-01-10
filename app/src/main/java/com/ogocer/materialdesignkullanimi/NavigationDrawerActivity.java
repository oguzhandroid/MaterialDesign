package com.ogocer.materialdesignkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private NavigationView navigationView;
    private Toolbar toolbarNavView;
    private DrawerLayout drawerLayout;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        navigationView = findViewById(R.id.navigationView);
        toolbarNavView = findViewById(R.id.toolbarNavView);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView.setNavigationItemSelectedListener(this);
         fragment = new NavFragmentBir();
         getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu_nav_view,fragment).commit();


        setSupportActionBar(toolbarNavView);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbarNavView,0,0);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            Intent intent = new Intent(NavigationDrawerActivity.this,MainActivity.class);
            finish();
            startActivity(intent);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_nav1_1:
                fragment = new NavFragmentBir();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu_nav_view,fragment).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            case R.id.action_nav1_2:
                fragment = new NavFragmentIki();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu_nav_view,fragment).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            case R.id.action_nav2_1:
                fragment = new NavFragmentUc();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu_nav_view,fragment).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            case R.id.action_nav2_2:
                Toast.makeText(this, "Tıklanan : İkinci Alt Başlık", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            default:
                return false;
        }
    }
}