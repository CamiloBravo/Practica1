package com.camilobc.appresistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    RadioButton checkBox11, checkBox12, checkBox13, checkBox14, checkBox15, checkBox16, checkBox17, checkBox18, checkBox19, checkBox20;
    RadioButton checkBox21, checkBox22, checkBox23, checkBox24, checkBox25, checkBox26, checkBox27, checkBox28,checkBox29;
    RadioButton checkBox30, checkBox31, checkBox32, checkBox33;
    Button borrar;
    EditText Resultado, concat, concat2, concat3, concat4;
    Double linea1, linea2, linea3, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox2=(RadioButton) findViewById(R.id.checkBox2);
        checkBox3=(RadioButton) findViewById(R.id.checkBox3);
        checkBox4=(RadioButton) findViewById(R.id.checkBox4);
        checkBox5=(RadioButton) findViewById(R.id.checkBox5);
        checkBox6=(RadioButton) findViewById(R.id.checkBox6);
        checkBox7=(RadioButton) findViewById(R.id.checkBox7);
        checkBox8=(RadioButton) findViewById(R.id.checkBox8);
        checkBox9=(RadioButton) findViewById(R.id.checkBox9);
        checkBox10=(RadioButton) findViewById(R.id.checkBox10);
        checkBox11=(RadioButton) findViewById(R.id.checkBox11);
        checkBox12=(RadioButton) findViewById(R.id.checkBox12);
        checkBox13=(RadioButton) findViewById(R.id.checkBox13);
        checkBox14=(RadioButton) findViewById(R.id.checkBox14);
        checkBox15=(RadioButton) findViewById(R.id.checkBox15);
        checkBox16=(RadioButton) findViewById(R.id.checkBox16);
        checkBox17=(RadioButton) findViewById(R.id.checkBox17);
        checkBox18=(RadioButton) findViewById(R.id.checkBox18);
        checkBox19=(RadioButton) findViewById(R.id.checkBox19);
        checkBox20=(RadioButton) findViewById(R.id.checkBox20);
        checkBox21=(RadioButton) findViewById(R.id.checkBox21);
        checkBox22=(RadioButton) findViewById(R.id.checkBox22);
        checkBox23=(RadioButton) findViewById(R.id.checkBox23);
        checkBox24=(RadioButton) findViewById(R.id.checkBox24);
        checkBox25=(RadioButton) findViewById(R.id.checkBox25);
        checkBox26=(RadioButton) findViewById(R.id.checkBox26);
        checkBox27=(RadioButton) findViewById(R.id.checkBox27);
        checkBox28=(RadioButton) findViewById(R.id.checkBox28);
        checkBox29=(RadioButton) findViewById(R.id.checkBox29);
        checkBox30=(RadioButton) findViewById(R.id.checkBox30);
        checkBox31=(RadioButton) findViewById(R.id.checkBox31);
        checkBox32=(RadioButton) findViewById(R.id.checkBox32);
        checkBox33=(RadioButton) findViewById(R.id.checkBox33);
        Resultado=(EditText) findViewById(R.id.Resultado);
        borrar=(Button) findViewById(R.id.borrar);

        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        checkBox4.setOnClickListener(this);
        checkBox5.setOnClickListener(this);
        checkBox6.setOnClickListener(this);
        checkBox7.setOnClickListener(this);
        checkBox8.setOnClickListener(this);
        checkBox9.setOnClickListener(this);
        checkBox10.setOnClickListener(this);
        checkBox11.setOnClickListener(this);
        checkBox12.setOnClickListener(this);
        checkBox13.setOnClickListener(this);
        checkBox14.setOnClickListener(this);
        checkBox15.setOnClickListener(this);
        checkBox16.setOnClickListener(this);
        checkBox17.setOnClickListener(this);
        checkBox18.setOnClickListener(this);
        checkBox19.setOnClickListener(this);
        checkBox20.setOnClickListener(this);
        checkBox21.setOnClickListener(this);
        checkBox22.setOnClickListener(this);
        checkBox23.setOnClickListener(this);
        checkBox24.setOnClickListener(this);
        checkBox25.setOnClickListener(this);
        checkBox26.setOnClickListener(this);
        checkBox27.setOnClickListener(this);
        checkBox28.setOnClickListener(this);
        checkBox29.setOnClickListener(this);
        checkBox30.setOnClickListener(this);
        checkBox31.setOnClickListener(this);
        checkBox32.setOnClickListener(this);
        checkBox33.setOnClickListener(this);
        borrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.checkBox2:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "1");
                break;
            case R.id.checkBox3:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "2");
                break;
            case R.id.checkBox4:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "3");
                break;
            case R.id.checkBox5:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "4");
                break;
            case R.id.checkBox6:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "5");
                break;
            case R.id.checkBox7:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "6");
                break;
            case R.id.checkBox8:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "7");
                break;
            case R.id.checkBox9:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "8");
                break;
            case R.id.checkBox10:
                concat = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat.getText().toString() + "9");
                break;
            case R.id.checkBox11:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "0");
                break;
            case R.id.checkBox12:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "1");
                break;
            case R.id.checkBox13:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "2");
                break;
            case R.id.checkBox14:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "3");
                break;
            case R.id.checkBox15:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "4");
                break;
            case R.id.checkBox16:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "5");
                break;
            case R.id.checkBox17:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "6");
                break;
            case R.id.checkBox18:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "7");
                break;
            case R.id.checkBox19:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "8");
                break;
            case R.id.checkBox20:
                concat2 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat2.getText().toString() + "9");
                break;
            case R.id.checkBox21:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=linea2*1;
                Resultado.setText(String.valueOf(total));
                break;
            case R.id.checkBox22:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=linea2*10;
                Resultado.setText(String.valueOf(total));
                break;
            case R.id.checkBox23:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=(linea2*100)/1000;
                Resultado.setText(String.valueOf(total)+"K");
                break;
            case R.id.checkBox24:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=(linea2*1000)/1000;
                Resultado.setText(String.valueOf(total)+"K");
                break;
            case R.id.checkBox25:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=(linea2*10000)/1000;
                Resultado.setText(String.valueOf(total)+"K");
                break;
            case R.id.checkBox26:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=linea2*100000/1000000;
                Resultado.setText(String.valueOf(total)+"M");
                break;
            case R.id.checkBox27:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=(linea2*1000000)/1000000;
                Resultado.setText(String.valueOf(total)+"M");
                break;
            case R.id.checkBox28:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=linea2*0.1;
                Resultado.setText(String.valueOf(total));
                break;
            case R.id.checkBox29:
                concat3 = (EditText)findViewById(R.id.Resultado);
                linea2=Double.parseDouble(concat3.getText().toString());
                total=linea2*0.01;
                Resultado.setText(String.valueOf(total));
                break;
            case R.id.checkBox30:
                concat4 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat4.getText().toString() + " + 1% (ohm)");
                break;
            case R.id.checkBox31:
                concat4 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat4.getText().toString() + " + 2% (ohm)");
                break;
            case R.id.checkBox32:
                concat4 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat4.getText().toString() + " + 5% (ohm)");
                break;
            case R.id.checkBox33:
                concat4 = (EditText)findViewById(R.id.Resultado);
                Resultado.setText(concat4.getText().toString() + " + 10% (ohm)");
                break;
            case R.id.borrar:
                Resultado.setText("");
                break;
        }
    }
}
