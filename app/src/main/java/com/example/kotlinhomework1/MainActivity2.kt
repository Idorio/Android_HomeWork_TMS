package com.example.kotlinhomework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val GoToNextActivity3 = findViewById<Button>(R.id.Button3)

        GoToNextActivity3.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
    }
}
}