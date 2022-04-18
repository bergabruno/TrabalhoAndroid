package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Filme

class FilmeAdapter (val listaFilmes:List<Filme>): RecyclerView.Adapter<FilmeAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvNome:TextView = view.findViewById(R.id.tvNome)
        val tvGenero:TextView = view.findViewById(R.id.tvGenero)
        val tvAutor:TextView = view.findViewById(R.id.tvAutor)
        val tvAno:TextView = view.findViewById(R.id.tvAno)
        val tvNota:TextView = view.findViewById(R.id.tvNota)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_filme, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val filme = listaFilmes[position]
        holder.tvNome.text = filme.nome
        holder.tvGenero.text = filme.genero
        holder.tvAutor.text = filme.autor
        holder.tvAno.text = filme.ano
        holder.tvNota.text = filme.nota
    }

    override fun getItemCount(): Int {
        return listaFilmes.size
    }

}