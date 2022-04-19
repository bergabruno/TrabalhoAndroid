package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.FilmeAdapter
import com.example.myapplication.model.Filme

class GetListaActivity : AppCompatActivity(), FilmeAdapter.OnfilmeClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_lista)

        val rvFilmes: RecyclerView = findViewById(R.id.rvFilmes)

        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = FilmeAdapter(RefLista.listaFilmes, this)

    }

    override fun onFilmeClick(filmePosition: Int) {
        val intent = Intent(this, VisualizarFilmeActivity::class.java)
        intent.putExtra("dados", RefLista.listaFilmes[filmePosition] )
        startActivity(intent)
    }
}