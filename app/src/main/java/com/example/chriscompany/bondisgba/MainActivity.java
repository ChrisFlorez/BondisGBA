package com.example.chriscompany.bondisgba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button agregar;
    Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregar = (Button) findViewById(R.id.bt_agregar);
        agregar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_agregar:
                Intent pantallaAgregar = new Intent(MainActivity.this, Agregar_Activity.class);
                startActivity(pantallaAgregar);
            break;
        }
    }
}
