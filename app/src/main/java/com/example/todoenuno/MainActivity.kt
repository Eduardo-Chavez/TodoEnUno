package com.example.todoenuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener{
            val intent = Intent(this, Juego::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this, Prestamo::class.java)
            startActivity(intent)

        }

        btn3.setOnClickListener{
            val intent = Intent(this, Viaje::class.java)
            startActivity(intent)
        }
    }
}
