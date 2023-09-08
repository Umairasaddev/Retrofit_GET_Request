package com.example.retrofitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsimple.API.EmployeeDInterface
import com.example.retrofitsimple.API.EmployeeDObject
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class EmployeeDActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_dactivity)

        val getEmployee = EmployeeDObject.getEmployeData().create(EmployeeDInterface::class.java)


        GlobalScope.launch {
            val result = getEmployee.getEmployeeData(10,1001)

            if (result.body()!=null){
//                Log.d("emplo", "Employee Data: ${result.body()}")

                result.body()!!.iterator().forEach {
                    Log.d("emplo", "Employee ID: ${it.id}")
                    Log.d("emplo", "First Name: ${it.firstName}")
                }
            }
        }

    }
}