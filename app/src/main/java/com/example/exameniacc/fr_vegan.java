package com.example.exameniacc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class fr_vegan extends AppCompatActivity {
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
            {"Burgen Vegana","Comer carne. Impossible ofrece todo el sabor, aroma y carne de la carne de vaca. Pero aquí está el truco: son solo las plantas haciendo lo imposible $5.990"},
            {"Ensalada","Ensaladera Vegana Para Tacos $4.990"},
            {"Trozos de soja","Carne de soja saludable y nutritiva, trozos en un tazón. $6.990"},
            {""},
    };



    int [] datosimg = {R.raw.vegan1,R.raw.vegan2,R.raw.vegan3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_vegan);
        Listado = (ListView) findViewById(R.id.index);
        Listado.setAdapter(new adaptador(this,datos,datosimg));

    }
}
