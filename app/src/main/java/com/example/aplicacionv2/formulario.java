package com.example.aplicacionv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    //Método para registrar
    public void Registrarse(View view){
        Intent registro = new Intent(this, MainActivity.class);
        Toast.makeText(this,"Has creado un usuario con éxito",Toast.LENGTH_LONG).show();
        startActivity(registro);
    }
}