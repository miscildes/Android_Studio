package com.gillie.alinhamento;

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

    public void gerarFrase (View view) {

        String [] frases = {
                "A vingança nunca é plena. Mata a alma e a envenena",
                "Bora frescar",
                "Preciosaaaaaaaa",
                "Gillie Hope"
        };
        int numero = new Random().nextInt(4);
        TextView texto = findViewById(R.id.frases);
        texto.setText(frases[numero]);
    }
}