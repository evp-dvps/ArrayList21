package com.devevp.arraylist21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class vistaAvatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_avatar);

        ImageView Avatar = findViewById(R.id.avatarcomp);

        Intent intent = getIntent();  //Creamos un Intent, para intercambiar informacion
        Bundle intento = intent.getExtras();//Budle nos permite obtener los datos

        if(intento!=null){
            Avatar.setImageResource(intento.getInt("avatar"));

        }


    }
}
