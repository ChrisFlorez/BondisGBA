package com.example.chriscompany.bondisgba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Agregar_Activity extends AppCompatActivity implements View.OnClickListener{
    EditText nombre,tipo,ramal,frecuencia;
    BaseDeDatos base = new BaseDeDatos(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        nombre = (EditText) findViewById(R.id.nombre);
        tipo = (EditText) findViewById(R.id.tipo);
        ramal = (EditText) findViewById(R.id.ramal);
        frecuencia = (EditText) findViewById(R.id.frecuencia);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_ok:
                base.insertar(nombre.toString(),tipo.toString(),ramal.toString(), frecuencia.toString());
                //Intent pantallaAgregar = new Intent(MainActivity.this, Agregar_Activity.class);
                //startActivity(pantallaAgregar);
                break;
        }
    }
}
