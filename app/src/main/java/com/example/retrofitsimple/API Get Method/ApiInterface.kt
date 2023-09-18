package com.example.retrofitsimple.`API Get Method`

import com.example.retrofitsimple.Model.UsersModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/users")
    suspend fun getUsers(): Response<UsersModel>
}