package com.gillie.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura (View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada (String opcaoSelecionada) {

        ImageView resultado = findViewById(R.id.imagemPrincipal);
        TextView textoResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        String[] opcao = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcao [numero];

        switch (opcaoApp) {
            case "pedra":
                resultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                resultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
                (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
                (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")
        ){
                textoResultado.setText("Você perdeu!");
        }
        else if (
                (opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura")
        ){
                textoResultado.setText("Você ganhou!");
        }
        else {
                textoResultado.setText("Empate!");
        }
        System.out.println(opcaoApp);
    }
}