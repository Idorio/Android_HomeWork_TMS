package com.example.kotlinhomework1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val GoToNextActivity4 = findViewById<Button>(R.id.Button4)

        GoToNextActivity4.setOnClickListener {
            startActivity(
                Intent(this, MainActivity4::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )


        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
       finishAffinity()
    }
}


