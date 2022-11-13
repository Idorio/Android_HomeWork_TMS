package com.example.kotlinhomework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val GoToNextActivity2 = findViewById<Button>(R.id.Button2)

        GoToNextActivity2.setOnClickListener{
            startActivity(
                Intent("OPEN_ACTIVITY2"))
        }
    }
}


//Задание :
//Создать новый репозиторий для андроид дз.
//Создать 3 активити и: +
//с активити 1 на активити 2 вы переходите по неявному intent +
//с активити 2 на активити 3 вы переходите по явному intent +
//С активити 3 когда пользователь нажмет на кнопку назад он выйдет из приложения.
//С активити 2 когда пользователь нажмет на кнопку назад он так и вернется на активити 1.
//
//Также создать еще активити 4 где при переходе на активити 4 с активити 3 активити 4 будет корневым и весь прошлый бэкстек стирется.
