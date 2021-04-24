package com.devevp.arraylist21;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//extends de BaseAdapter y generar metodos
public class Datos extends BaseAdapter {
    //variables globales
    //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity
    LayoutInflater inflater=null;
    //generar los datos
    Context context;
    String[] nombre;
    String [] edad;
    int [] avatar;

    //generar constructor
    public Datos(Context context, String[] nombres, String[] edades, int[] avatar) {
        this.context = context;
        this.nombre = nombres;
        this.edad = edades;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    //generar vista y asignar mediante inflate los elementos del archivo xml
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = inflater.inflate(R.layout.item_fila,null);
        //referenciar
        TextView Nombre= vista.findViewById(R.id.titulo);
        TextView Edad = vista.findViewById(R.id.descripcion);
        ImageView Avatar = vista.findViewById(R.id.avatar);

        //asignar datos a cada una de las posiciones
        Nombre.setText(nombre[position]);
        Edad.setText(edad[position]);
        Avatar.setImageResource(avatar[position]);

        Avatar.setTag(position);//Asiciamos la posicion del avatar
        Avatar.setOnClickListener(new View.OnClickListener() {// Al tocar el elemento realiza la accion programadaa
            @Override
            public void onClick(View v) { // Al hacer clic se realiza la accion
                Intent vistaAvatar=new Intent(context,vistaAvatar.class); //Intercambio de datos con la clase vista avatar, enviara la posicion del arreglo del avatar.
                vistaAvatar.putExtra("avatar",avatar[(Integer)v.getTag()]);//se identificara con avatar
                context.startActivity(vistaAvatar); //se inicia
            }
        });

        return vista;
    }
    @Override
    public int getCount() {
        return avatar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}