package com.gillie.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gillie.recyclerview.R;
import com.gillie.recyclerview.model.Filme;

import java.util.List;

// extende a classe viewholder, para criar uma visualização reciclada/reaproveitada
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    private List<Filme> listaFilmes;
    public Adapter(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    // método chamado para criar as visualizações
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // converter o arquivo xml para o tipo view
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    // metodo para exibir as visualizações criadas
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());

    }
    // retorna a quantidade de itens que serão exibidos
    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    // classe que guarda as informações que serão exibidas
    public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView titulo;
            TextView ano;
            TextView genero;

            // classe que acessa as informações criadas
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                titulo = itemView.findViewById(R.id.textTitulo);
                ano = itemView.findViewById(R.id.textAno);
                genero = itemView.findViewById(R.id.textGenero);
            }

        }
}
