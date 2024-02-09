package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText edt1;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1 = findViewById(R.id.editTextText);
        txtview = findViewById(R.id.textView3);
    }

    public void dairee(View view) {
        String s1 = edt1.getText().toString();

        if (s1.isEmpty()) {
            Toast.makeText(this, "Eleman Girişi Yapınız", Toast.LENGTH_SHORT).show();
        } else {
            double yaricap = Double.parseDouble(s1);
            double alan = Math.PI * yaricap * yaricap;
            txtview.setText("Dairenin Alanı: " + alan);
        }
    }
}