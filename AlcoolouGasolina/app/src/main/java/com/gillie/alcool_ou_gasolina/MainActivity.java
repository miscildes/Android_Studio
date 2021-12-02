package com.gillie.alcool_ou_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText precoAlcool, precoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco (View view) {
        String alcool = precoAlcool.getText().toString();
        String gasolina = precoGasolina.getText().toString();

        boolean camposValidados = validarCampos(alcool, gasolina);
        if (camposValidados) {

            // converte os valores em string para double
            double valorAlcool = Double.parseDouble(alcool);
            double valorGasolina = Double.parseDouble(gasolina);

            Double resultado = valorAlcool/valorGasolina;
            if (resultado >= 0.7) {
                textResultado.setText("Use gasolina!");
            }else
                textResultado.setText("Use Álcool!");

        } else
            textResultado.setText("Preencha os valores");
    }

    public boolean validarCampos(String pAlcool, String pGasolina) {
        boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;

        } else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }
        return camposValidados;
    }
}