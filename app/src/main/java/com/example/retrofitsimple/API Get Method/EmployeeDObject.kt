package com.example.retrofitsimple.`API Get Method`

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object EmployeeDObject {

    private val BASE_URL = "https://hub.dummyapis.com/"


    fun getEmployeData():Retrofit{
  return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}