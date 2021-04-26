package com.gabrielcarneiro.frasesdodiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        TextView texto = findViewById(R.id.textResultado);


        String[] frases = {"Fica de boa parça!",
            "Vai na fé!",
            "Pega a visão cero",
            "Maior onda irmão",
            "VISÃO!! VISÃO!!",
            "Fica de quebrada hoje po",
            "Chora não bê..."

        };
        int numero = new Random().nextInt(7);

        texto.setText(frases[numero]);


    }
}