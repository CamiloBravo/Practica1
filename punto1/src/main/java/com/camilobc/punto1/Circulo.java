package com.camilobc.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    EditText areaCir, perimetroCir, radio;

    Button Calculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        radio=(EditText) findViewById(R.id.radioCir);
        Calculo=(Button) findViewById(R.id.Calculo);
        areaCir=(EditText) findViewById(R.id.areaCir);
        perimetroCir=(EditText) findViewById(R.id.perimetroCir);

        Calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resulArea, resulPeri, radioCirculo;
                radioCirculo= Double.parseDouble(radio.getText().toString());
                resulArea=3.1416*Math.pow(radioCirculo, 2);
                resulPeri=2*3.1416*radioCirculo;
                areaCir.setText(String.valueOf(resulArea));
                perimetroCir.setText(String.valueOf(resulPeri));// base.setVisibility(View.VISIBLE) en lugar de visible va GONE

            }
        });

    }
}
