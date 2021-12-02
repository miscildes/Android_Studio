package com.gillie.minhagorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.gillie.minhagorgeta.R;

public class MainActivity extends AppCompatActivity {

    private EditText valorConta;
    private TextView textViewPorcentagem, editTextGorjeta, editTextTotal;
    private SeekBar seekBarPorcen;
    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorConta = findViewById(R.id.inputTextValor);
        textViewPorcentagem = findViewById(R.id.textViewPorcentagem);
        editTextGorjeta = findViewById(R.id.editTextGorjeta);
        editTextTotal = findViewById(R.id.editTextTotal);
        seekBarPorcen = findViewById(R.id.seekBarPorcen);

        seekBarPorcen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = progress;
                textViewPorcentagem.setText(Math.round(porcentagem) + " %");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular() {
        String valorDigitado = valorConta.getText().toString();

        if (valorDigitado == null || valorDigitado.equals("") ) {
            Toast.makeText(getApplicationContext(), "Digite um valor", Toast.LENGTH_LONG).show();
        }
        else {
            double valorConta = Double.parseDouble(valorDigitado);

            double gorjeta = valorConta * (porcentagem/100);
            double total = gorjeta + valorConta;

            editTextGorjeta.setText("R$ " + Math.round(gorjeta));
            editTextTotal.setText("R$ " + Math.round(total));
        }
    }

}