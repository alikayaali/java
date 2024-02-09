package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edt1;
    EditText edt2;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1 = (EditText) findViewById(R.id.editTextText);
        edt2 = (EditText) findViewById(R.id.editTextText2);
        txtview = (TextView) findViewById(R.id.textView3);
    }

    public void ücgenn   (View view) {
        String s1 = edt1.getText().toString();
        String s2 = edt2.getText().toString();

        if (s1.isEmpty() || s2.isEmpty()) {
            Toast.makeText(this, "Eleman Girişi Yapınız", Toast.LENGTH_SHORT).show();
        } else {
            int yukseklik = Integer.parseInt(s1);
            int taban = Integer.parseInt(s2);

            double sonuc = (1.0 / 2) * (yukseklik * taban); // Doğru işlem önceliğini sağlamak için 1.0 ile bölme işlemi yapılır
            txtview.setText("Sonuc: " + sonuc);
        }
    }
}