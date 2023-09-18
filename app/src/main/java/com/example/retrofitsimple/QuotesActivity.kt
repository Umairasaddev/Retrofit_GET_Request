package com.example.retrofitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsimple.`API Get Method`.QuotesInterface
import com.example.retrofitsimple.`API Get Method`.QuotesObject
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class QuotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        val QuotesApi = QuotesObject.getQuotesInstance().create(QuotesInterface::class.java)

        GlobalScope.launch {
            val result = QuotesApi.getQuotes(1)

            if (result.body()!=null){
                Log.d("quote", "Quotes: ${result.body()}")
            }
        }
    }
}