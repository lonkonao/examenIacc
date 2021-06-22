package com.example.exameniacc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador extends BaseAdapter {
    private static LayoutInflater inflater = null;
    Context contexto;
    String [][] datos;
    int [] datosImg;

    public adaptador(Context contexto, String [][] datos, int [] imagenes){
        this.contexto=contexto;
        this.datos=datos;
        this.datosImg= imagenes;
        inflater=(LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        final View vista = inflater.inflate(R.layout.elementos_listas,null);
        TextView Text_1 = (TextView) vista.findViewById(R.id.titulo);
        TextView Text_2 = (TextView) vista.findViewById(R.id.descripcion);
        ImageView imagen = (ImageView) vista.findViewById(R.id.img_arte);
        Text_1.setText(datos[i][0]);
        Text_2.setText(datos[i][1]);
        imagen.setImageResource(datosImg[i]);
        imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent visorImagen = new Intent (contexto,
                        visor_imagen.class);
                visorImagen.putExtra ("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });

        return vista;
    }
}
