package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonÜcgen;
    Button buttonDaire;
    Button buttonDikdörgen;
    Button buttonKare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        buttonÜcgen = (Button) findViewById(R.id.button);
        buttonDaire = (Button) findViewById(R.id.button2);
        buttonDikdörgen = (Button) findViewById(R.id.button3);
        buttonKare = (Button) findViewById(R.id.button4);


    }

    public void Ücgen(View view) {
        Intent intentücgen = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intentücgen);

    }

    public void daire(View view) {
        Intent intentdaire=new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intentdaire);
    }

    public void diktdörtgen(View view) {
        Intent intentdikdörtgen=new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intentdikdörtgen);
    }

    public void kare(View view) {
        Intent intentkare=new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intentkare);
    }
}