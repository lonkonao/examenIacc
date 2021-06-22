package com.example.exameniacc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class MainActivity extends AppCompatActivity {

    EditText edtUsuario,edtPassword;
    Button btnLogin,btnRegistrar;
    String usuario,password;

    private FirebaseAuth mAuth;

// ...
// Initialize Firebase Auth



    @Override


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
        setContentView(R.layout.activity_main);
        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnRegistrar=findViewById(R.id.btnRegistrar2);
        mAuth = FirebaseAuth.getInstance();


    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }



    public void iniciarSession(View view){
        mAuth.signInWithEmailAndPassword(edtUsuario.getText().toString(),edtPassword.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(getApplicationContext(), "Inicio exitoso",Toast.LENGTH_SHORT).show();
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent intent = new Intent(getApplicationContext(),PrincipalActivity.class);

                            startActivity(intent);
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                           // Log.w(TAG, "signInWithCustomToken:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Usuario y/o Contraseña incorrectos",Toast.LENGTH_SHORT).show();
                           // updateUI(null);
                        }
                    }
                });
    }

}