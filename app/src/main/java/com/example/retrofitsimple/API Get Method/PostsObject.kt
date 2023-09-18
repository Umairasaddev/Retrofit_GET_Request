package com.example.retrofitsimple.`API Get Method`

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostsObject {


    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    fun getPostObjects():Retrofit
    {
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    }
}