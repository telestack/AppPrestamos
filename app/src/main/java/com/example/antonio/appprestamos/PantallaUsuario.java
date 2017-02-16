package com.example.antonio.appprestamos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class PantallaUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_usuario);

        if(AccessToken.getCurrentAccessToken() == null){

            irPrincipal();
        }
    }

    public void irPrincipal(){

        Intent i = new Intent(this, Principal.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

    }

    public void cerrarSesion(View view){

        LoginManager.getInstance().logOut();
        irPrincipal();

    }
}
