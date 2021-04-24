package com.devevp.arraylist21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String nombre[]={"Eduardo Villalobos Peña","Carlos Gonzalez Sanchez","Roberto Martinez Ruiz","Ariadna Mendoza Camacho","Amanda Alvarez Juarez",
            "Arturo Medina Jimenez","Adriana Alavarez Juarez","Daniel Medina Jimenez" };
    String correo[]={"lalo1927@gmail.com","cgnz19@gmail.com","rmartr205@gmail.com","arizz1105@gmail.com", "amancr19@gmail.com","artmj45@gmail.com",
            "adrialj18@gmail.com","danmj78@gmail.com"};
    int avatar[]={R.drawable.user1,R.drawable.user2,R.drawable.user3,R.drawable.user4,R.drawable.user5,R.drawable.user6,R.drawable.user7,R.drawable.user8};
    String edad[]={"24 Años","25 Años","26 Años","21 Años","22 Años","23 Años","19 Años","22 Años","24 Años"};
    String area[]={"Sistemas","Sistemas","Industrial","Psicologia","Enfermeria","Industrial","Psicologia","Mecanica"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instanciar vista
        listView = findViewById(R.id.lista);
        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new Datos(this,nombre,edad,avatar));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //Para que tome el valor del item seleccionado
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent vistaInfo=new Intent(view.getContext(),vistaInfo.class);//intent intercambia la informacion en este caso con la clase vistaInfo
                vistaInfo.putExtra("nombre",nombre[position]);//Datos a intercambiar
                vistaInfo.putExtra("correo",correo[position]);
                vistaInfo.putExtra("edad",edad[position]);
                vistaInfo.putExtra("area",area[position]);
                startActivity(vistaInfo);//inicioamos la actividad
            }
        });
    }
}