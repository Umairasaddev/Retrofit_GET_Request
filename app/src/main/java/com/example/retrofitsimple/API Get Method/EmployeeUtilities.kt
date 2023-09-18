package com.example.retrofitsimple.`API Get Method`

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object EmployeeUtilities {

    private val URL = "https://dummy.restapiexample.com/"

    fun getEmployeeInstance() :Retrofit{
        return Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}