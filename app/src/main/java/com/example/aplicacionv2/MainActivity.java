package com.example.aplicacionv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Método para ir a la pantalla de registro
    public void Registrarse(View view){
        Intent registro = new Intent(this, formulario.class);
        Toast.makeText(this,"Crea un usuario",Toast.LENGTH_LONG).show();
        startActivity(registro);
    }

    //Método logeo
    public void Ingresar(View view){
        Intent ingre = new Intent(this, Menu2Activity.class);
        Toast.makeText(this,"Has ingresado con éxito",Toast.LENGTH_LONG).show();
        startActivity(ingre);
    }

    //Método llamada telefónica
    public void callPhoneNumber(View view) {
        String phone = ("628871976");
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+phone));
        startActivity(callIntent);
    }
}