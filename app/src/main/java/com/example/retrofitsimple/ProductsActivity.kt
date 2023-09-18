package com.example.retrofitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsimple.`API Get Method`.ProductsInterface
import com.example.retrofitsimple.`API Get Method`.ProductsObject
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productApi = ProductsObject.getProductsInstance().create(ProductsInterface::class.java)


        GlobalScope.launch {
            val result = productApi.getProducts()

            if (result.body()!=null){
                Log.d("product", "Products: ${result.body()}")
            }
        }

    }
}