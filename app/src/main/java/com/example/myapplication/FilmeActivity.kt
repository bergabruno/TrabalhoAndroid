package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FilmeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filme)

        val etEmail:EditText = findViewById(R.id.etEmail);
        val etSenha:EditText = findViewById(R.id.etSenha);


        val btEntrar:Button = findViewById(R.id.btLogin)
        btEntrar.setOnClickListener{
            validar(etEmail.text.toString(), etSenha.text.toString())
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