package com.example.retrofitsimple

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofitsimple.`API Get Method`.EmployeeApiInterface
import com.example.retrofitsimple.`API Get Method`.EmployeeUtilities
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class EmployeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        val employeeAPI =
            EmployeeUtilities.getEmployeeInstance().create(EmployeeApiInterface::class.java)

        GlobalScope.launch {
            val result = employeeAPI.getEmployees()
            if (result.body() != null) {
             Log.d("venom", "employee: ${result.body().toString()}")


            }

        }
    }
}
