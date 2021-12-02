package com.gillie.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gillie.cardview.R;
import com.gillie.cardview.adapter.Adapter;
import com.gillie.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(this,3);
        recyclerPostagem.setLayoutManager(layoutManager);


        //define adapter
        this.criarPostagem();
        Adapter adapter = new Adapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void criarPostagem() {
        Postagem p = new Postagem("Gillie Ferreira", "#Dia de viajar", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Gillie Ferreira", "#Amo Muito", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Gillie Ferreira", "#França", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Gillie Ferreira", "#Viajar é tão bom", R.drawable.imagem4);
        this.postagens.add(p);



    }
}