/*
Anggota
//1. Nama/Nim = Damai Saputra Laoli / 10119012
//2. Nama/Nim = Andri Dwi Prasetyo / 10119014
//3. Nama/Nim = Agi Sutrisna / 10119015
//4. Nama/Nim = Aditya Ilham Subagja / 10119016
//5. Nama/Nim = M Rifqu Abdillah / 10119042*/

package com.example.tugasbesarakbif1premanpensiun;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasbesarakbif1premanpensiun.ui.activity.SliderActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Menghilangkan Action Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, SliderActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}