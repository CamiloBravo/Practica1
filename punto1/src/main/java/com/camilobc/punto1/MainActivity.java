package com.camilobc.punto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rdo1, rdo2, rdo3, rdo4;
//    Double areaT, perimetroT, areaCua, perimetroCua, areaCir, areaEsf, volumen, lado1, lado2, lado3, base, altura, ladoCua, radioE, radioCir;
//    EditText ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdo1=(RadioButton) findViewById(R.id.radio1);
        rdo2=(RadioButton) findViewById(R.id.radio2);
        rdo3=(RadioButton) findViewById(R.id.radio3);
        rdo4=(RadioButton) findViewById(R.id.radio4);


        //asignamos el metodo OnClick o touch de los botones

        rdo1.setOnClickListener(this);
        rdo2.setOnClickListener(this);
        rdo3.setOnClickListener(this);
        rdo4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.radio3:
                Intent intent=new Intent(MainActivity.this, Triangulo.class); //ojo a lo que antepone el this!!!
                startActivityForResult(intent,1234);
                break;
            case R.id.radio2:
                Intent intent2=new Intent(MainActivity.this, Circulo.class); //ojo a lo que antepone el this!!!
                startActivity(intent2);
                break;
            case R.id.radio1:
                Intent intent3=new Intent(MainActivity.this, Cuadrado.class); //ojo a lo que antepone el this!!!
                startActivityForResult(intent3,1236);
                break;
            case R.id.radio4:
                Intent intent4=new Intent(MainActivity.this, Cubo.class); //ojo a lo que antepone el this!!!
                startActivityForResult(intent4,1237);
                break;

        }


    }
}
