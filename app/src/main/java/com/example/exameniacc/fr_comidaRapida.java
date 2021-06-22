package com.example.exameniacc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class fr_comidaRapida extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal,menu);
        return true;

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.bt_vegan:
                Intent afr_vegan = new Intent(this,fr_vegan.class);
                startActivity(afr_vegan);
                return true;

            case R.id.bt_comida:
                Intent afr_comida = new Intent(this,fr_comidaRapida.class);
                startActivity(afr_comida);
                return true;

            case R.id.bt_bebestible:
                Intent afr_bebestibles = new Intent(this,fr_bebestibles.class);
                startActivity(afr_bebestibles);
                return true;

            default:

        }
        return super.onOptionsItemSelected(item);
    }
    ListView Listado;

    String [] [] datos = {
            {"Burger Premium","Dos Hamburguesas de carne 100% vacuno en Pan Tipo Brioche con salsa BigMac, Cebolla Caramelizada, Tomate, Lechuga, tocino y Queso Cheddar. $4.990"},
            {"Doble Burger","Quizás sean las dos hamburguesas de pura carne con salsa y queso derretido, el toque de cebolla y el crocante de pepino. Bueno, quizá sea sólo que es la más alta… $3.990"},
            {"Burger Pollo","Pechuga de Pollo servida en nuestro suave pan y acompañada de Tomate, cebolla, crujiente Lechuga y mayonesa. Tan Clasica que las palabras sobran. $4.990"},
            {""},
    };



    int [] datosimg = {R.raw.burger1,R.raw.burger2,R.raw.burger3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_comida);
        Listado = (ListView) findViewById(R.id.index);
        Listado.setAdapter(new adaptador(this,datos,datosimg));

    }
}
