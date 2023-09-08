package com.example.retrofitsimple.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProductsObject {

    private val BASEURl = "https://dummyjson.com/"

    fun getProductsInstance() :Retrofit{
        return Retrofit.Builder().baseUrl(BASEURl).addConverterFactory(GsonConverterFactory.create()).build()
    }
}