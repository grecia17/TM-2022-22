package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ParImpar extends AppCompatActivity implements View.OnClickListener{
    EditText num1;
    TextView tvpi;
    Button btnpoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_impar);
        num1 = (EditText)findViewById(R.id.numerpi);
        tvpi = (TextView)findViewById(R.id.txresPI);
        btnpoi = (Button)findViewById(R.id.btnPI);
        btnpoi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int npi;
        npi = Integer.parseInt(num1.getText().toString());
        if ((npi % 2) ==0)
        {
            tvpi.setText("El numero es par");
            Toast.makeText(this, "El numero es par", Toast.LENGTH_LONG).show();
        }
        else{
            tvpi.setText("El numero es impar");
            Toast.makeText(this, "El numero es impar", Toast.LENGTH_LONG).show();
        }
    }
}