package com.example.retrofitsimple.API

import com.example.retrofitsimple.Model.EmployeeD
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EmployeeDInterface {


    @GET("/employee")
    suspend fun getEmployeeData(
        @Query("noofRecords") noofRecords: Int,
        @Query("idStarts") idStarts: Int
    ):
            Response<EmployeeD>
}