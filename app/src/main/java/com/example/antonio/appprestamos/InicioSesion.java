package com.example.antonio.appprestamos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {

    private EditText user, pass;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        tv3 = (TextView)findViewById(R.id.tv3);

        tv3.setText(Html.fromHtml("<font color='blue'><u>¿Olvido su contraseña?</u></font>"));
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), OlvidarContrasena.class);
                startActivity(intent);
            }
        });
    }

    public void ingresar(View view){

        if(user.getText().toString().length() == 0 && pass.getText().toString().length() == 0){
            Toast notificacion = Toast.makeText(this, "No ha ingresado usuario ni contraseña",Toast.LENGTH_LONG);
            notificacion.show();
        }else if(user.getText().toString().length() == 0){
            Toast notificacion1 = Toast.makeText(this, "No ha ingresado usuario",Toast.LENGTH_LONG);
            notificacion1.show();
        }else if(pass.getText().toString().length() == 0){
            Toast notificacion2 = Toast.makeText(this, "No ha ingresado contraseña",Toast.LENGTH_LONG);
            notificacion2.show();
        }else {

            Intent i = new Intent(this, InicioSesion.class);
            startActivity(i);
        }
    }
}
