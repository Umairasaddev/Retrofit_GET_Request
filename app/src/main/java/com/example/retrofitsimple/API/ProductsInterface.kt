package com.example.retrofitsimple.API

import com.example.retrofitsimple.Model.Products
import retrofit2.Response
import retrofit2.http.GET

interface ProductsInterface {

    @GET("/products")
    suspend fun getProducts() : Response<Products>
}