package com.example.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById<Button>(R.id.button) as Button
        val myTextView = findViewById<TextView>(R.id.textView) as TextView
        var timesClicked = 0

        btn_click_me.setOnClickListener{
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me", Toast.LENGTH_SHORT).show()
        }
    }
}
