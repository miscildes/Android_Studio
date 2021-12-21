package com.gillie.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gillie.fragments.R;
import com.gillie.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConversa = findViewById(R.id.buttonConversa);
        buttonContato = findViewById(R.id.buttonContato);

        //remover gravity da action bar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        // configurar objeto para fragmento
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        //transaction.add(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidx.fragment.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            }
        });


    }
}