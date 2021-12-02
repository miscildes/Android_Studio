package com.gillie.toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view) {
        // instanciar o alerta de dialogo
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        // definir o titulo e a mensagem
        dialogo.setTitle("mensagem");
        dialogo.setMessage("mensagem da dona dorinha");

        //nao permitir que o usuario cancele o dialogo em uma resposta
        dialogo.setCancelable(false);

        dialogo.setIcon(android.R.drawable.ic_menu_week);

        //configurar o botão sim e a ação
        dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Executar", Toast.LENGTH_LONG).show();
            }
        });

        // configurar o botão não e a ação
        dialogo.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Cancelar", Toast.LENGTH_LONG).show();
            }
        });

        //criar e exibir
        dialogo.create();
        dialogo.show();





        /*ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.ic_dialog_alert);

        TextView texto = new TextView(getApplicationContext());
        texto.setBackgroundResource(R.color.purple_200);
        texto.setText("Olá Caralho");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(texto);
        toast.show();

         */

        //Toast.makeText(getApplicationContext(),"Ação realizada com sucesso", Toast.LENGTH_LONG).show();

    }
}