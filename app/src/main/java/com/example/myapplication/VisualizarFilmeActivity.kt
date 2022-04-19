package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.model.Filme
import org.w3c.dom.Text

private lateinit var filme:Filme

class VisualizarFilmeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_filme)

        filme = intent.getSerializableExtra("dados") as Filme

        println(filme.toString())

        val tvNomeFilme:TextView = findViewById(R.id.tvNomeFilme)
        val tvGeneroFilme:TextView = findViewById(R.id.tvGeneroFilme)
        val tvAutorFilme:TextView = findViewById(R.id.tvAutorFilme)
        val tvAnoFilme:TextView = findViewById(R.id.tvAnoFilme)
        val tvNotaFilme:TextView = findViewById(R.id.tvNotaFilme)

        tvNomeFilme.text = filme.nome
        tvGeneroFilme.text = filme.genero
        tvAutorFilme.text = filme.autor
        tvAnoFilme.text = filme.ano
        tvNotaFilme.text = filme.nota

    }
}