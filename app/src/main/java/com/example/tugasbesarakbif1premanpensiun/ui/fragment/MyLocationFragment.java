package com.example.tugasbesarakbif1premanpensiun.ui.fragment;

/*Anggota
//1. Nama/Nim = Damai Saputra Laoli / 10119012
//2. Nama/Nim = Andri Dwi Prasetyo / 10119014
//3. Nama/Nim = Agi Sutrisna / 10119015
//4. Nama/Nim = Aditya Ilham Subagja / 10119016
//5. Nama/Nim = M Rifqu Abdillah / 10119042 */

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tugasbesarakbif1premanpensiun.Asia_profile;
import com.example.tugasbesarakbif1premanpensiun.Kawah_profile;
import com.example.tugasbesarakbif1premanpensiun.Maribaya_profile;
import com.example.tugasbesarakbif1premanpensiun.R;
import com.example.tugasbesarakbif1premanpensiun.Wonderland_profile;
import com.example.tugasbesarakbif1premanpensiun.ui.view.Asia_Afrika;
import com.example.tugasbesarakbif1premanpensiun.ui.view.KawahActivity;
import com.example.tugasbesarakbif1premanpensiun.ui.view.MaribayaActivity;
import com.example.tugasbesarakbif1premanpensiun.ui.view.Wonderland_Activity;

public class MyLocationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_location,
                container, false);



        ImageView im1 = (ImageView) view.findViewById(R.id.asia);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Asia_profile.class);
                startActivity(intent);
            }
        });

        ImageView im2 = (ImageView) view.findViewById(R.id.lembang);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Wonderland_profile.class);
                startActivity(intent);
            }
        });

        ImageView im3 = (ImageView) view.findViewById(R.id.kawah);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Kawah_profile.class);
                startActivity(intent);
            }
        });

        ImageView im4 = (ImageView) view.findViewById(R.id.myloc);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Maribaya_profile.class);
                startActivity(intent);
            }
        });


        return view;
    }
}