package com.gillie.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.collection.CircularArray;
import androidx.recyclerview.widget.RecyclerView;

import com.gillie.cardview.R;
import com.gillie.cardview.model.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    private List<Postagem> listaP;

    public Adapter(List<Postagem> postagens) {
        this.listaP = postagens;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_postagem, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

        Postagem post = listaP.get(position);
        holder.titulo.setText(post.getNome());
        holder.comentario.setText(post.getPostagem());
        holder.foto.setImageResource(post.getImagem());
    }

    @Override
    public int getItemCount() {
        return listaP.size();
    }

    //inner class (classe dentro de classe)
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo;
        private ImageView foto;
        private TextView comentario;
        private Button curtir;
        private Button comentar;

        // classe construtora que acessa as informações criadas
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            comentario = itemView.findViewById(R.id.textPostagem);
            foto = itemView.findViewById(R.id.imagePostagem);

        }

    }
}
