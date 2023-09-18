package com.example.retrofitsimple.`API Get Method`

import com.example.retrofitsimple.Model.Posts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PostsInterface {


    @GET("/posts")
    suspend fun getPosts(@Query("page") page:Int) : Response<Posts>
}