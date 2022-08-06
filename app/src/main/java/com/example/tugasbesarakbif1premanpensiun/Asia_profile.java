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

import com.example.tugasbesarakbif1premanpensiun.ui.view.Asia_Afrika;


public class Asia_profile extends AppCompatActivity implements View.OnClickListener {

    Button btn_asia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia_profile);

        btn_asia = findViewById(R.id.btn_asia);
        btn_asia.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_asia:
                Intent m = new Intent(this, Asia_Afrika.class);
                startActivity(m);
                break;
        }
    }
}
