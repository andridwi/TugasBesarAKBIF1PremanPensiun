package com.example.tugasbesarakbif1premanpensiun.ui.adapter;

//Anggota
//1. Nama/Nim = Damai Saputra Laoli / 10119012
//2. Nama/Nim = Andri Dwi Prasetyo / 10119014
//3. Nama/Nim = Agi Sutrisna / 10119015
//4. Nama/Nim = Aditya Ilham Subagja / 10119016
//5. Nama/Nim = M Rifqu Abdillah / 10119042

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;

import com.example.tugasbesarakbif1premanpensiun.databinding.FragmentHomeBinding;

public class PageAdapter extends PagerAdapter {
    int[] layouts;
    LayoutInflater layoutInflater;
    public PageAdapter(Context context, int[] layouts){
        this.layouts = layouts;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(layouts[position],container, false);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}