package com.example.exameniacc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PrincipalActivity extends AppCompatActivity {
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}