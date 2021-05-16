package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {
    EditText Nombre, Peso, Altura;
    Button Calcular, Limpiar;
    RadioButton Hombre, Mujer;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Nombre = (EditText) findViewById(R.id.Nombre);
        Peso = (EditText) findViewById(R.id.Peso);
        Altura = (EditText) findViewById(R.id.Altura);
        Calcular = (Button) findViewById(R.id.Calcular);
        Limpiar = (Button) findViewById(R.id.Limpiar);
        Hombre = (RadioButton) findViewById(R.id.Hombre);
        Mujer = (RadioButton) findViewById(R.id.Mujer);
        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nombre.setText("");
                Altura.setText("");
                Peso.setText("");
            }
        });

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre=Nombre.getText().toString();
                double altura=Integer.parseInt(Altura.getText().toString());
                double peso=Integer.parseInt(Peso.getText().toString());
                double altura2=altura/100;
                double respuesta=peso/(altura2*altura2);

                Toast.makeText(MainActivity3.this,"Tu IMC es: " + respuesta + "",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity3.this,"Nombre: " + nombre + "",Toast.LENGTH_LONG).show();
                if (Mujer.isChecked() == true)
                    Toast.makeText(MainActivity3.this,"ERES MUJER" , Toast.LENGTH_SHORT).show();
                else if (Hombre.isChecked() == true)
                    Toast.makeText(MainActivity3.this,"ERES VARON"  ,Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity3.this,"No eligio género",Toast.LENGTH_SHORT).show();

            }
        });
    }

}
