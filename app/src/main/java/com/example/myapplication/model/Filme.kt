package com.example.myapplication.model

import java.io.Serializable

data class Filme (
    val nome: String,
    val genero:String,
    val autor:String,
    val ano:String,
    val nota:String
):Serializable