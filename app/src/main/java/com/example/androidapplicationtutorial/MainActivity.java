package com.example.androidapplicationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_reg = findViewById(R.id.btn_register);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Register Here", Toast.LENGTH_LONG).show();
            }
        });

        TextView tv_log = findViewById(R.id.tv_login);
        tv_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Login.class);
                startActivity(in);
                Toast.makeText(MainActivity.this, "Login Here", Toast.LENGTH_LONG).show();
            }
        });
    }
}