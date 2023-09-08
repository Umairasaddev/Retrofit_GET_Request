package com.example.retrofitsimple.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//object alss will contain retrofit url and object of retrofit
object QuotesObject {

    private val BASEURL = "https://quotable.io/"

    fun getQuotesInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build()

    }

}