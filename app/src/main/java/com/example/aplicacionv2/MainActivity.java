package com.example.aplicacionv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para ir a la pantalla de registro
    public void Registrarse(View view){
        Intent registro = new Intent(this, formulario.class);
        startActivity(registro);
    }
}