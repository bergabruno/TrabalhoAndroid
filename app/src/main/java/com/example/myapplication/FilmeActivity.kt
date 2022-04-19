package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class FilmeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filme)

        val etEmail:EditText = findViewById(R.id.etEmail);
        val etSenha:EditText = findViewById(R.id.etSenha);
        val tvCriarConta: TextView = findViewById(R.id.tvCriarConta)


        val btEntrar:Button = findViewById(R.id.btLogin)
        btEntrar.setOnClickListener{
            validar(etEmail.text.toString(), etSenha.text.toString())
        }

        tvCriarConta.setOnClickListener{
            TODO("criar pagina de criar a conta")
            val intent = Intent(this, FilmeActivity::class.java)
            startActivity(intent)
        }
    }


    fun validar(email:String, senha:String){
        if(email == "" || senha == ""){

        }else{
            val intent = Intent(this, AddFilmeActivity::class.java)
            startActivity(intent)
        }
    }
}