package com.example.aplicacionv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    //Método para registrar
    public void Registrarse(View view){
        Intent registro = new Intent(this, MainActivity.class);
        startActivity(registro);
    }
}