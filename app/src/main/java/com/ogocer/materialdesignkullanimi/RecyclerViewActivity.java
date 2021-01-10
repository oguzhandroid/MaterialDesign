package com.ogocer.materialdesignkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView rv;
    private MyRvAdapter adapter;
    private ArrayList<String> bilgiList = new ArrayList<>();
    private ArrayList<Integer> bilgiNoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rv = findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        bilgiList.add("Bilgi 1");
        bilgiList.add("Bilgi 2");
        bilgiList.add("Bilgi 3");
        bilgiList.add("Bilgi 4");
        bilgiList.add("Bilgi 5");
        bilgiList.add("Bilgi 6");
        bilgiList.add("Bilgi 7");
        bilgiList.add("Bilgi 8");
        bilgiList.add("Bilgi 9");
        bilgiList.add("Bilgi 10");

        bilgiNoList.add(1);
        bilgiNoList.add(2);
        bilgiNoList.add(3);
        bilgiNoList.add(4);
        bilgiNoList.add(5);
        bilgiNoList.add(6);
        bilgiNoList.add(7);
        bilgiNoList.add(8);
        bilgiNoList.add(9);
        bilgiNoList.add(10);

        adapter = new MyRvAdapter(this,bilgiList,bilgiNoList);
        rv.setAdapter(adapter);

    }
}