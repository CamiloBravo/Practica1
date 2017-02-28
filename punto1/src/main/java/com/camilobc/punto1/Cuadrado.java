package com.camilobc.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cuadrado extends AppCompatActivity {

    EditText ladocua, areaCua, perimetroCua;
    Button Calculo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        ladocua=(EditText) findViewById(R.id.ladoCua);
        areaCua=(EditText) findViewById(R.id.areaCua);
        perimetroCua=(EditText) findViewById(R.id.perimetroCua);
        Calculo2=(Button) findViewById(R.id.Calculo2);

        Calculo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lado, resulA, resulP;
                lado=Double.parseDouble(ladocua.getText().toString());
                resulA=Math.pow(lado, 2);
                resulP=4*lado;
                areaCua.setText(String.valueOf(resulA));
                perimetroCua.setText(String.valueOf(resulP));
            }
        });



    }
}
