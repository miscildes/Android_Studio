package com.gillie.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.aula.recyclerview.recyclerItemClickListener;
import com.gillie.recyclerview.R;
import com.gillie.recyclerview.adapter.Adapter;
import com.gillie.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listagem de filme
        this.criarFilmes();

        //configurar o adapter
        Adapter adapter = new Adapter(listaFilmes);

        // configurar recycler
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(new recyclerItemClickListener(getApplicationContext(), recyclerView, new recyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Filme filme = listaFilmes.get(position);
                Toast.makeText(getApplicationContext(), "Item Pressionado: " + filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Filme filme = listaFilmes.get(position);
                Toast.makeText(getApplicationContext(), "Item Selecionado: " + filme.getTituloFilme(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));
    }

    public void criarFilmes() {
        Filme filme = new Filme("Homem Aranha - De volta ao lar", "Aventura", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A coisa", "Terror", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Viva - a vida é uma festa", "Animação", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("O diabo veste Prada", "Drama", "2005");
        this.listaFilmes.add(filme);

        filme = new Filme("A mentira", "Comédia/Drama", "2010");
        this.listaFilmes.add(filme);

        filme = new Filme("Perigo em alto mar", "Suspense", "2010");
        this.listaFilmes.add(filme);

        filme = new Filme("127 horas", "Drama", "2010");
        this.listaFilmes.add(filme);

        filme = new Filme("A entidade", "Terror", "2012");
        this.listaFilmes.add(filme);

        filme = new Filme("A mulher de preto", "Terror", "2012");
        this.listaFilmes.add(filme);

        filme = new Filme("Até que a sorte nos separe", "Comédia", "2012");
        this.listaFilmes.add(filme);

        filme = new Filme("O impossível", "Drama", "2012");
        this.listaFilmes.add(filme);
    }
}