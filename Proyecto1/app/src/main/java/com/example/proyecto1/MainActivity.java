package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Calculadora;
    Button btnImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculadora=(Button)findViewById(R.id.Calculadora);

        Calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        btnImc=(Button)findViewById(R.id.btnImc);

        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, MainActivity3.class);
                startActivity(i);
            }
        });

    }
}