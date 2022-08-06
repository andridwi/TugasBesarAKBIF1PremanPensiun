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

import com.example.tugasbesarakbif1premanpensiun.ui.view.Wonderland_Activity;

public class Wonderland_profile extends AppCompatActivity implements View.OnClickListener{

    Button btn_wonderland;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonderland_profile);

        btn_wonderland = findViewById(R.id.btn_wonderland);
        btn_wonderland.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_wonderland:
                Intent m = new Intent(this, Wonderland_Activity.class);
                startActivity(m);
                break;
        }
    }
}