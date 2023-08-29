package com.danielvargasospina.clase2;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextView mensajeVisible;

    EditText nombreUsuario;

    int usernName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeVisible=findViewById(R.id.mensajeVisible);
        nombreUsuario=findViewById(R.id.nombreUsuario);

        mensajeVisible.setText("oe");
        nombreUsuario.getText();

        usernName = Integer.parseInt(nombreUsuario.getText().toString());







    }
}