package com.example.viva3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        btn1.setOnClickListener {
            Intent(applicationContext,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        btn2.setOnClickListener {
            Intent(applicationContext,MapsActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}