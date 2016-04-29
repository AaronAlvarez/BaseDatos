package com.example.aaron.basedatos;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Principal extends AppCompatActivity {

    public static Datos d;
    public static Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        c=this;
        d= new Datos(c);
    }

    public void captura(View view){
        Intent i = new Intent (this, captura.class);
        i.putExtra("tipo", "captura");
        startActivity(i);
    }

    public void buscar(View view){
        change(buscar.class);
    }
    public void borrar(View view){
        change(borrar.class);
    }

    public void change(Class cl){
        Intent i = new Intent (this, cl);
        startActivity(i);
    }

}
