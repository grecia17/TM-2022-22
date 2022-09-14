package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RaizCuadrada extends AppCompatActivity implements View.OnClickListener{
    EditText Num;
    TextView tvr;
    Button btnrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz_cuadrada);

        Num = (EditText)findViewById(R.id.Number);
        tvr = (TextView)findViewById(R.id.txresRC);
        btnrc = (Button)findViewById(R.id.btnRaiz);
        btnrc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float R1;
        R1 = Float.parseFloat(Num.getText().toString());
        double resrc = Math.sqrt(R1);
        tvr.setText("La raiz cuadrada es: "+resrc);
        Toast.makeText(getApplicationContext(),"El resultado es: "+resrc, Toast.LENGTH_LONG).show();
    }
}