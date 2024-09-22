package com.example.todo1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent1 = Intent (this, MainActivity::class.java)
            startActivity(intent1)
        }

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent (this, timer::class.java)
            startActivity(intent1)
        }

        var button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            val intent1 = Intent (this, stopwatch::class.java)
            startActivity(intent1)
        }


    }
}