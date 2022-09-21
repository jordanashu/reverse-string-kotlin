package com.example.reverse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById(R.id.t1) as EditText
        val btn = findViewById(R.id.button) as Button

        val t = findViewById(R.id.out) as TextView

        btn.setOnClickListener {
            val stringReverse  = input.text.toString().reversed()
            t.text=stringReverse
        }


    }
}