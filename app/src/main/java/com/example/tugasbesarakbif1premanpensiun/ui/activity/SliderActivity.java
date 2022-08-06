package com.example.tugasbesarakbif1premanpensiun.ui.activity;

//Anggota
//1. Nama/Nim = Damai Saputra Laoli / 10119012
//2. Nama/Nim = Andri Dwi Prasetyo / 10119014
//3. Nama/Nim = Agi Sutrisna / 10119015
//4. Nama/Nim = Aditya Ilham Subagja / 10119016
//5. Nama/Nim = M Rifqu Abdillah / 10119042

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.viewpager.widget.ViewPager;

import com.example.tugasbesarakbif1premanpensiun.R;
import com.example.tugasbesarakbif1premanpensiun.ui.adapter.PageAdapter;

public class SliderActivity extends AppCompatActivity {

    ViewPager viewPager;
    Button btnNext;
    int[] layouts;
    PageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        viewPager = findViewById(R.id.pager);
        btnNext = findViewById(R.id.nextBtn);

        layouts = new int[] {
                R.layout.slider1,
                R.layout.slider2,
                R.layout.slider3
        };

        adapter = new PageAdapter(this, layouts);
        viewPager.setAdapter(adapter);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()+1<layouts.length){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                }else{
                    //kembali ke main activity
                    startActivity(new Intent(SliderActivity.this, MainActivity.class));
                    finish();
                }
            }
        });

        viewPager.addOnPageChangeListener(viewPagerChangeListener);
    }

    ViewPager.OnPageChangeListener viewPagerChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            if(i == layouts.length -1 ){
                btnNext.setText("Mulai");
            }else {
                btnNext.setText("Lanjutkan");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}