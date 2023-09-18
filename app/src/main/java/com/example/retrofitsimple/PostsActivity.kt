package com.example.retrofitsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitsimple.`API Get Method`.PostsInterface
import com.example.retrofitsimple.`API Get Method`.PostsObject
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PostsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)


        val post = PostsObject.getPostObjects().create(PostsInterface::class.java)

        GlobalScope.launch {
            val result  = post.getPosts(1)


            if (result.body()!=null){
                Log.d("post", "Posts: ${result.body()}")
            }
        }


    }
}