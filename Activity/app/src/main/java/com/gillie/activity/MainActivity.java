package com.gillie.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botaoDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoDados = findViewById(R.id.buttonDados);

        // método para criar um evento de click
        botaoDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // parar passar para uma nova activity (criar uma intenção)
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                //instanciar objeto
                Usuario usuario = new Usuario("Gillie", "miscildes@gmail.com");

                //passar dados
                intent.putExtra("nome","Dona Dorinha");
                intent.putExtra("idade",666);
                intent.putExtra("objeto", usuario);
                startActivity(intent);
            }
        });
    }
}