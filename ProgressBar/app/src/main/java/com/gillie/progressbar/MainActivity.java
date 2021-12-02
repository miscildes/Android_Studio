package com.gillie.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar barra;
    private ProgressBar circulo;
    private int progresso = 0;
    private SeekBar escala;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra = findViewById(R.id.progressBarLinha);
        circulo = findViewById(R.id.progressBarCircular);
        escala = findViewById(R.id.seekBarEscala);
        textResultado = findViewById(R.id.textResultado);


        escala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResultado.setText("Progresso: " + progress + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        circulo.setVisibility(View.GONE);
    }

    public void carregar(View view) {

        this.progresso += 1;
        barra.setProgress(this.progresso);

        circulo.setVisibility(View.VISIBLE);
        if (this.progresso == 10) {
            circulo.setVisibility(View.GONE);
        }

    }

}