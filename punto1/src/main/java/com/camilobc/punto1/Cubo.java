package com.camilobc.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {

    EditText ladoCu, areaCu, volumenCu;
    Button calcular4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        ladoCu=(EditText) findViewById(R.id.ladoCu);
        areaCu=(EditText) findViewById(R.id.areaCu);
        volumenCu=(EditText) findViewById(R.id.volumenCu);
        calcular4=(Button) findViewById(R.id.Calculo4);

        calcular4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lado, area, vol;
                lado=Double.parseDouble(ladoCu.getText().toString());
                area=6*Math.pow(lado, 2);
                vol=Math.pow(lado, 3);
                areaCu.setText(String.valueOf(area));
                volumenCu.setText(String.valueOf(vol));
            }
        });
    }
}
