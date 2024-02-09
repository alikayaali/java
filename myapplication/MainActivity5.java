package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText editTextUzunluk;
    EditText editTextGenislik;
    TextView textViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextUzunluk = findViewById(R.id.editTextText);
        editTextGenislik = findViewById(R.id.editTextText2);
        textViewSonuc = findViewById(R.id.textView3);
    }

    public void dikdörtgenn(View view) {
        String uzunlukStr = editTextUzunluk.getText().toString();
        String genislikStr = editTextGenislik.getText().toString();

        if (uzunlukStr.isEmpty() || genislikStr.isEmpty()) {
            Toast.makeText(this, "Lütfen uzunluk ve genişlik değerlerini girin", Toast.LENGTH_SHORT).show();
        } else {
            double uzunluk = Double.parseDouble(uzunlukStr);
            double genislik = Double.parseDouble(genislikStr);
            double alan = uzunluk * genislik;

            textViewSonuc.setText("Dikdörtgen Alanı: " + alan);
        }
    }
}