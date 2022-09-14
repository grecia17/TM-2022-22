package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button A, B, C, D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = (Button)findViewById(R.id.btnA);
        B = (Button)findViewById(R.id.btnB);
        C = (Button)findViewById(R.id.btnC);
        D = (Button)findViewById(R.id.btnD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent A = new Intent(MainActivity.this, Sumatorio.class);
                startActivity(A);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B = new Intent(MainActivity.this, RaizCuadrada.class);
                startActivity(B);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent C = new Intent(MainActivity.this, ParImpar.class);
                startActivity(C);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent D = new Intent(MainActivity.this, Frase.class);
                startActivity(D);
            }
        });
    }
}