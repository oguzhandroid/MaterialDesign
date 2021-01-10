package com.ogocer.materialdesignkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ArrayList<Fragment> fragmentListesi = new ArrayList<>();
    private ArrayList<String> baslikListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
        fragmentListesi.add(new TabFragmentBir());
        fragmentListesi.add(new TabFragmentIki());
        fragmentListesi.add(new TabFragmentUc());

        baslikListesi.add("İtem Bir");
        baslikListesi.add("İtem İki");
        baslikListesi.add("İtem Üç");



        MyViewPagerAdapter adapter = new MyViewPagerAdapter(this);

        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout,viewPager2,
                (tab,position)->tab.setText(baslikListesi.get(position))).attach();


    }

    public class MyViewPagerAdapter extends FragmentStateAdapter{

        public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentListesi.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentListesi.size();
        }
    }
}