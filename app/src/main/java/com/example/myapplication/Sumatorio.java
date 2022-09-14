package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sumatorio extends AppCompatActivity implements View.OnClickListener {
    EditText n1, n2;
    TextView tv1;
    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatorio);
        n1 = (EditText)findViewById(R.id.number1);
        n2 = (EditText)findViewById(R.id.number2);
        tv1 = (TextView)findViewById(R.id.TxResult);
        btnsuma = (Button)findViewById(R.id.btnsumar);
        btnsuma.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float N1, N2, res;
        N1 = Float.parseFloat(n1.getText().toString());
        N2 = Float.parseFloat(n2.getText().toString());
        res = N1 + N2;
        tv1.setText("El resultado es: "+res);
        Toast.makeText(getApplicationContext(),"El resultado es: "+res, Toast.LENGTH_LONG).show();
    }
}