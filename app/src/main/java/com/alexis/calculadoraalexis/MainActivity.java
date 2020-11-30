package com.alexis.calculadoraalexis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bo0,bo1, bo2, bo3, bo4, bo5, bo6, bo7, bo8, bo9;
    TextView txt;
    double res;
    String operacion, mostrar , reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        bo0 = findViewById(R.id.b0);
        bo1 = findViewById(R.id.b1);
        bo2 = findViewById(R.id.b2);
        bo3 = findViewById(R.id.b3);
        bo4 = findViewById(R.id.b4);
        bo5 = findViewById(R.id.b5);
        bo6 = findViewById(R.id.b6);
        bo7 = findViewById(R.id.b7);
        bo8 = findViewById(R.id.b8);
        bo9 = findViewById(R.id.b9);

        txt = findViewById(R.id.text);
        bo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mostrar = txt.getText().toString();
                mostrar = mostrar + "0";
                txt.setText(mostrar);
            }
        });
        bo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "1";
                txt.setText(mostrar);
            }
        });
        bo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "2";
                txt.setText(mostrar);
            }
        });
        bo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "3";
                txt.setText(mostrar);
            }
        });
        bo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "4";
                txt.setText(mostrar);
            }
        });
        bo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "5";
                txt.setText(mostrar);
            }
        });
        bo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "6";
                txt.setText(mostrar);
            }
        });
        bo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "7";
                txt.setText(mostrar);
            }
        });
        bo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = txt.getText().toString();
                mostrar = mostrar + "8";
                txt.setText(mostrar);
            }
        });
    }
    public void boton9(View view) {
        mostrar = txt.getText().toString();
        mostrar = mostrar + "9";
        txt.setText(mostrar);
    }

    public void division(View view) {
        reserva = txt.getText().toString();
        operacion = "/";
        txt.setText("");
    }

    public void resta(View view) {
        reserva = txt.getText().toString();
        operacion = "-";
        txt.setText("");
    }

    public void multiplicar(View view) {
        reserva = txt.getText().toString();
        operacion = "*";
        txt.setText("");
    }

    public void suma(View view) {
        reserva = txt.getText().toString();
        operacion = "+";
        txt.setText("");
    }

    public void borrar(View view) {
        if(mostrar.isEmpty()){
            Toast.makeText(getApplicationContext(),"No existe texto que borar",Toast.LENGTH_SHORT);
        }
        else
            mostrar = txt.getText().toString();
            mostrar = mostrar.substring(0,mostrar.length()-1);
            txt.setText(mostrar);
        }}
    public void clear(View view) {
        txt.setText("");
    }


    public void restultado(View view) {


        mostrar = txt.getText().toString();
        mostrar = mostrar + "1";
        if(operacion.equals("-")){
            res = Double.parseDouble(reserva) - Double.parseDouble(txt.getText().toString());
            txt.setText(String.valueOf(res));
        }
        if(operacion.equals("+")){
            res = Double.parseDouble(reserva) + Double.parseDouble(txt.getText().toString());
            txt.setText(String.valueOf(res));
        }
        if(operacion.equals("/")){
            res = Double.parseDouble(reserva) / Double.parseDouble(txt.getText().toString());
            txt.setText(String.valueOf(res));
        }
        if(operacion.equals("*")){
            res = Double.parseDouble(reserva) * Double.parseDouble(txt.getText().toString());
            txt.setText(String.valueOf(res));
        }
    }
}