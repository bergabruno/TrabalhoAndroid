package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.model.Filme

class AddFilmeActivity : AppCompatActivity() {

    private lateinit var listaFilmes:MutableList<Filme>
    private lateinit var etLancamento:EditText
    private lateinit var etGenero:EditText
    private lateinit var etAutor:EditText
    private lateinit var etNota:EditText
    private lateinit var etNome:EditText
    private lateinit var tvCampo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_filme)

        etNome = findViewById(R.id.etNome)
        etGenero = findViewById(R.id.etGenero)
        etAutor = findViewById(R.id.etAutor)
        etLancamento = findViewById(R.id.etAno)
        etNota = findViewById(R.id.etNota)

        val btAdicionar:Button = findViewById(R.id.btAdicionarFilme)
        val btGetLista: Button = findViewById(R.id.btGetLista)

        listaFilmes = mutableListOf()
        btAdicionar.setOnClickListener{
            cadastrarItem(etNome.text.toString(), etGenero.text.toString(), etAutor.text.toString(),
            etLancamento.text.toString(), etNota.text.toString())
        }

        btGetLista.setOnClickListener{
            val intent = Intent(this, AddFilmeActivity::class.java)
            startActivity(intent)
        }

    }

    fun cadastrarItem(nome: String, genero: String, autor: String, ano: String, nota: String) {
        if(validar(nome, genero, autor, ano, nota)){
            listaFilmes.add(Filme(nome = nome, genero = genero, autor = autor, ano = ano, nota = nota))
        }
    }

    fun validar(nome: String, genero: String, autor: String, ano: String, nota: String): Boolean{
        val padrao:String = "precisa estar preeenchido";
        tvCampo = findViewById(R.id.tvCampoOut)
        if(nome == ""){
            tvCampo.text = "nome $padrao"
            return false;
        }else if(genero == ""){
            tvCampo.text = "genero $padrao"
            return false;
        }else if(autor == ""){
            tvCampo.text = "autor $padrao"
            return false;
        }else if(ano == ""){
            tvCampo.text = "ano $padrao"
            return false;
        }else if(nota == ""){
            tvCampo.text = "nota $padrao"
            return false;
        }

        etNome.text.clear()
        etAutor.text.clear()
        etGenero.text.clear()
        etLancamento.text.clear()
        etNota.text.clear()
        tvCampo.text = "Filme Adicionado com sucesso!"
        return true;
    }
}