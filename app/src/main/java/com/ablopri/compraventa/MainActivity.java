package com.ablopri.compraventa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText titulo, descripcion, email, precio, direccionRetiro;
    Button publicar;
    Spinner categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializo los elementos de la pantalla que no son estáticos
        titulo = (EditText) findViewById(R.id.editTextTitulo);
        descripcion = (EditText) findViewById(R.id.editTextDescripcion);
        email = (EditText) findViewById(R.id.editTextEmail);
        precio = (EditText) findViewById(R.id.editTextPrecio);
        direccionRetiro = (EditText) findViewById(R.id.editTextDireccionDeRetiro);
        publicar = (Button) findViewById(R.id.buttonPublicar);
        categoria = (Spinner) findViewById(R.id.spinnerCategoria);

        //Elementos del spinner
        final String[] categorias = {"INDUMENTARIA", "ELECTRONICA", "ENTRETENIMIENTO", "JARDIN", "VEHICULOS", "JUGUETES"};
        ArrayAdapter<CharSequence> adaptadorCategorias = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categorias);
        categoria.setAdapter(adaptadorCategorias);




    }

    boolean esEmailValido(String correo){


        return true;
    }
}