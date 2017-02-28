package com.camilobc.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Double num1, num2, resul;
    EditText eNumero, concat;
    String oper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero=(EditText) findViewById(R.id.eNumero);

    }
    protected void click(View view) {
        int id=view.getId();
        switch (id){
            case R.id.b0:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "0");
                break;
            case R.id.b1:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "1");

                break;
            case R.id.b2:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "2");

                break;
            case R.id.b3:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "3");
                break;
            case R.id.b4:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "4");
                break;
            case R.id.b5:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "5");
                break;
            case R.id.b6:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "6");
                break;
            case R.id.b7:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "7");
                break;
            case R.id.b8:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "8");
                break;
            case R.id.b9:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + "9");
                break;
            case R.id.bMas:
                oper="+";
                concat=(EditText)findViewById(R.id.eNumero);
                num1= Double.parseDouble(concat.getText().toString());
                eNumero.setText("");
                break;
            case R.id.bMenos:
                oper="-";
                concat=(EditText)findViewById(R.id.eNumero);
                num1=Double.parseDouble(concat.getText().toString());
                eNumero.setText("");
                break;
            case R.id.bPor:
                oper="*";
                concat=(EditText)findViewById(R.id.eNumero);
                num1=Double.parseDouble(concat.getText().toString());
                eNumero.setText("");
                break;
            case R.id.bDivido:
                oper="/";
                concat=(EditText)findViewById(R.id.eNumero);
                num1=Double.parseDouble(concat.getText().toString());
                eNumero.setText("");
                break;
            case R.id.bPunto:
                concat = (EditText)findViewById(R.id.eNumero);
                eNumero.setText(concat.getText().toString() + ".");
                break;
            case R.id.bClear:
//                num1=0.0;
//                num2=0.0;
                eNumero.setText("");
                break;
            case R.id.bIgual:
                concat=(EditText)findViewById(R.id.eNumero);
                num2= Double.parseDouble(concat.getText().toString());
                if(oper.equals("+"))
                {
                    eNumero.setText("");
                    resul= num1 + num2;
                }

                if (oper.equals("-"))
                {
                    eNumero.setText("");
                    resul= num1 - num2;
                }

                if (oper.equals("*"))
                {
                    eNumero.setText("");
                    resul=num1*num2;
                }

                if (oper.equals("/"))
                {
                    eNumero.setText("");
                    if (num2 !=0)
                    {
                        resul = num1 / num2;
                    }

                    else
                    {
                        eNumero.setText("Infinito");
                    }
                }

                if (oper.equals("="))
                {
                    eNumero.setText("");
                    resul=num1; // si es asi?
                }
                eNumero.setText(String.valueOf(resul));

                break;


        }
    }

}

