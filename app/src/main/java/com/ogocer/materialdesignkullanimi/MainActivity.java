package com.ogocer.materialdesignkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Özel Toolbar");
        toolbar.setTitleTextColor(Color.RED);
        toolbar.setSubtitle("Material Design Kullanımı");

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_recyclerview:
                startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
                return true;
            case R.id.action_bottomnavigationview:
                startActivity(new Intent(MainActivity.this, BottomNavigationActivity.class));
                return true;
            case R.id.action_navigationdrawer:
                return true;
            case R.id.action_tablayout:
                startActivity(new Intent(MainActivity.this, TabLayoutActivity.class));
                return true;
            default:
                return false;
        }


    }
}