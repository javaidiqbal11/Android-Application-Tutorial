package com.example.androidapplicationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    finish();
                    Intent cv = new Intent(Splash.this, MainActivity.class);
                    startActivity(cv);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}