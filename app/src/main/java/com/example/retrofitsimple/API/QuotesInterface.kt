package com.example.retrofitsimple.API

import com.example.retrofitsimple.Model.QuotesModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


//interface will contain abstract methods and response
//it will be created first

interface QuotesInterface {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page:Int):Response<QuotesModel>
}