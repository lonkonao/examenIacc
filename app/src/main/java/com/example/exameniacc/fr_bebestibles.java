package com.example.exameniacc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class fr_bebestibles extends AppCompatActivity {
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
            {"AGUA 500cc","AGUA MINERAL VITAL $1.000"},
            {"JUGO","Una forma fresca y nutritiva de vencer la sed. El jugo de fruta tuvo hace más de un año una reducción en el azúcar agregado $1.500"},
            {"Pepsi","SIN AZÚCAR $1.500"},
            {""},
    };



    int [] datosimg = {R.raw.bebestible1,R.raw.bebestible2,R.raw.bebestible3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr_comida);
        Listado = (ListView) findViewById(R.id.index);
        Listado.setAdapter(new adaptador(this,datos,datosimg));

    }
}
