package com.example.retrofitsimple.API

import com.example.retrofitsimple.Model.EmployeeModel
import retrofit2.Response
import retrofit2.http.GET

interface EmployeeApiInterface {

    @GET("/api/v1/employees")
    suspend fun getEmployees() : Response<EmployeeModel>
}
