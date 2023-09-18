package com.example.retrofitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsimple.`API Get Method`.ApiInterface
import com.example.retrofitsimple.`API Get Method`.ApiUtilities
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usersAPI = ApiUtilities.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val result = usersAPI.getUsers()//showing error because we have used suspend function to not run it on main thread

            if (result.body() !=null){

//                Log.d("umair","onCreate: ${result.body()}")


                result.body()!!.iterator().forEach {
                    Log.d("umair", "name: ${it.id}")
                    Log.d("umair", "name: ${it.login}")
                }
            }
        }
    }
}