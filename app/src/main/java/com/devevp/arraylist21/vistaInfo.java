package com.devevp.arraylist21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class vistaInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_info);

        TextView nombre = (TextView) findViewById(R. id. titulodesc);
        TextView correo = (TextView) findViewById(R. id. descripciondesc);
        TextView area = (TextView) findViewById(R. id. areadesc);
        TextView edad = (TextView) findViewById(R. id. edaddesc);

        Intent intent = getIntent();
        Bundle intento = intent. getExtras();

        if(intento!=null) {
            nombre. setText(intento. getString("nombre" ));
            correo. setText(intento. getString("correo" ));
            area. setText(intento. getString("area" ));
            edad. setText(intento. getString("edad" ));
        }

    }
}