package com.example.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.button) as Button

        btn_click_me.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me", Toast.LENGTH_SHORT).show()
        }
    }
}
