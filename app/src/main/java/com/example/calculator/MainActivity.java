package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText numero_uno;
private EditText numero_dos;
private TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero_uno = findViewById(R.id.number1);
        numero_dos = findViewById(R.id.number2);
        respuesta= findViewById(R.id.result);

    }

    public void sumar (View view){

        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString())
                    + Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }catch (Exception e){
            Toast.makeText(this,"Introduzca dos numeros para sumar",
            Toast.LENGTH_SHORT).show ();
            System.out.print("");
        }
    }

    public void restar (View view){
        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString())
                    - Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }catch (Exception e){
        Toast.makeText(this,"Introduzca dos numeros para sumar",
                Toast.LENGTH_SHORT).show ();
        System.out.print("");
    }
    }

    public void multiplicar (View view){
        try{
        Integer respuestaNumero = Integer.parseInt (numero_uno.getText().toString())
                * Integer.parseInt (numero_dos.getText().toString());
        respuesta.setText(respuestaNumero + "");
        }catch (Exception e){
            Toast.makeText(this,"Introduzca dos numeros para sumar",
                    Toast.LENGTH_SHORT).show ();
            System.out.print("");
        }
    }

    public void dividir (View view){
        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString())
                    / Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }catch (Exception e){
        Toast.makeText(this,"Introduzca dos numeros para sumar",
                Toast.LENGTH_SHORT).show ();
        System.out.print("");
    }
    }

    public void manualusuario (View view){
Intent i = new Intent (this, manualapp.class);
startActivity(i);

    }


}