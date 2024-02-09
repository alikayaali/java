package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    EditText editTextKenar;
    TextView textViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextKenar = findViewById(R.id.editTextText);
        textViewSonuc = findViewById(R.id.textView3);
    }

    public void karee(View view) {
        String kenarStr = editTextKenar.getText().toString();

        if (kenarStr.isEmpty()) {
            Toast.makeText(this, "Lütfen kenar uzunluğunu girin", Toast.LENGTH_SHORT).show();
        } else {
            double kenar = Double.parseDouble(kenarStr);
            double alan = kenar * kenar;

            textViewSonuc.setText("Karenin Alanı: " + alan);
        }
    }
}