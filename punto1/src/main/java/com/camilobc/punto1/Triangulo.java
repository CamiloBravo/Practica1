package com.camilobc.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    Button CalcularT;
    EditText lado1T, lado2T, lado3T, baseT, alturaT, areaT, perimetroT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        lado1T=(EditText) findViewById(R.id.lado1);
        lado2T=(EditText) findViewById(R.id.lado2);
        lado3T=(EditText) findViewById(R.id.lado3);
        baseT=(EditText) findViewById(R.id.base);
        alturaT=(EditText) findViewById(R.id.altura);
        areaT=(EditText) findViewById(R.id.areaT);
        perimetroT=(EditText) findViewById(R.id.perimetroT);
        CalcularT=(Button) findViewById(R.id.Calcular3);

        CalcularT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double areaTri, periTri, lado1, lado2, lado3, base, altura;

                lado1=Double.parseDouble(lado1T.getText().toString());
                lado2=Double.parseDouble(lado2T.getText().toString());
                lado3=Double.parseDouble(lado3T.getText().toString());
                base=Double.parseDouble(baseT.getText().toString());
                altura=Double.parseDouble(alturaT.getText().toString());

                periTri=lado1+lado2+lado3;
                areaTri=(base*altura)/2;
                perimetroT.setText(String.valueOf(periTri));
                areaT.setText(String.valueOf(areaTri));
            }
        });
    }
}
