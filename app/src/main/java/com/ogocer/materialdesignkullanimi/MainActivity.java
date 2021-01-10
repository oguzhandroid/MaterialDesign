package com.ogocer.materialdesignkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;

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
}