package com.example.tugasbesarakbif1premanpensiun;
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

import com.example.tugasbesarakbif1premanpensiun.ui.view.MaribayaActivity;

public class Maribaya_profile extends AppCompatActivity implements View.OnClickListener {

    Button btn_maribaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maribaya_profile);

        btn_maribaya = findViewById(R.id.btn_maribaya);
        btn_maribaya.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_maribaya:
                Intent m = new Intent(this, MaribayaActivity.class);
                startActivity(m);
                break;
    }
}
}