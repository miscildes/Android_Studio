package com.gillie.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoNome, campoEmail;
    private TextView textoResultado;

    private CheckBox checkPort, checkMat, checkBio, checkFilo;
    private RadioButton radioButtonMasc, radioButtonFem, radioButtonOutro;
    private RadioGroup opcaoGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.campoNome);
        campoEmail = findViewById(R.id.campoEmail);
        textoResultado = findViewById(R.id.textoResultado);

        checkPort = findViewById(R.id.checkPort);
        checkMat = findViewById(R.id.checkMat);
        checkBio = findViewById(R.id.checkBio);
        checkFilo = findViewById(R.id.checkFilo);

        radioButtonMasc = findViewById(R.id.radioButtonMasc);
        radioButtonFem = findViewById(R.id.radioButtonFem);
        radioButtonOutro = findViewById(R.id.radioButtonOutro);
    }

    public void checkBox() {
        String texto = "Selecionado (s): ";

        if (checkPort.isChecked()) {
            texto = texto + "Português ";
        }
        if (checkMat.isChecked()) {
            texto = texto + "Matemática ";
        }
        if (checkBio.isChecked()) {
            texto = texto +  "Biologia ";
        }
        if (checkFilo.isChecked()) {
            texto = texto + "Filosofia ";
        }

        textoResultado.setText(texto);
    }

    public void radioButton() {
        if (radioButtonMasc.isChecked()) {
                textoResultado.setText("Masculino");

        } else if (radioButtonFem.isChecked()) {
                textoResultado.setText("Feminino");

        }else {
                textoResultado.setText("Outro Gênero");
        }
    }

    public void enviar (View view) {
        //checkBox();
        radioButton();
    }

}