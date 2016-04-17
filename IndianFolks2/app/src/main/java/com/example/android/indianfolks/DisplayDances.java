package com.example.android.indianfolks;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DisplayDances extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dances);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
Intent intent = getIntent();
    public void Garba(View view){
        Intent intent1 = new Intent(this, Garba.class);
        startActivity(intent1);
    }
    public void Kuchipudi(View view){
        Intent intent2 = new Intent(this, Kuchipudi.class);
        startActivity(intent2);
    }

    public void Bhangra(View view){
        Intent intent3 = new Intent(this, Bhangra.class);
        startActivity(intent3);
    }
    public void Kathak(View view){
        Intent intent4 = new Intent(this, Kathak.class);
        startActivity(intent4);
    }
    public void Lavani(View view){
        Intent intent5 = new Intent(this, Lavani.class);
        startActivity(intent5);
    }
    public void Ghoomar(View view){
        Intent intent6 = new Intent(this, Ghoomar.class);
        startActivity(intent6);
    }
}
