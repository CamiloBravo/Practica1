package com.camilobc.punto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePracticas, e1avance, e2avance, e3avance, eApp, eFinal;
    Button bCalcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePracticas=(EditText) findViewById(R.id.ePracticas);
        e1avance=(EditText) findViewById(R.id.e1avance);
        e2avance=(EditText) findViewById(R.id.e3avance);
        e3avance=(EditText) findViewById(R.id.e2avance);
        eApp=(EditText) findViewById(R.id.eApp);
        eFinal=(EditText) findViewById(R.id.eFinal);
        bCalcu=(Button) findViewById(R.id.bCalcu);

        bCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nota;

                nota=Double.parseDouble(ePracticas.getText().toString())*0.6+
                        Double.parseDouble(e1avance.getText().toString())*0.05+
                        Double.parseDouble(e2avance.getText().toString())*0.07+
                        Double.parseDouble(e3avance.getText().toString())*0.08+
                        Double.parseDouble(eApp.getText().toString())*0.2;
                eFinal.setText(String.valueOf(nota));
                if (nota>=0 && nota <=1 )
                {
                    Toast.makeText(getApplicationContext(), "Estas en el lugar equivocado", Toast.LENGTH_LONG).show();
                }
                if (nota>1 && nota <=2 )
                {
                    Toast.makeText(getApplicationContext(), "Remal", Toast.LENGTH_LONG).show();
                }
                if (nota>2 && nota <=3 )
                {
                    Toast.makeText(getApplicationContext(), "Es posible recuperarse", Toast.LENGTH_LONG).show();
                }
                if (nota>3 && nota <=4.5 )
                {
                    Toast.makeText(getApplicationContext(), "Normalito", Toast.LENGTH_LONG).show();
                }
                if (nota>4.5 && nota<=5)
                {
                    Toast.makeText(getApplicationContext(), "Excelente estudiante", Toast.LENGTH_LONG).show();
                }
                if (nota>5)
                {
                    Toast.makeText(getApplicationContext(), "Datos mal ingresados", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast.makeText(this, "Error en el registro", Toast.LENGTH_SHORT).show();

    }
}
