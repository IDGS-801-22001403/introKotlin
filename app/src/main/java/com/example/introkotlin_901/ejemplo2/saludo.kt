package com.example.introkotlin_901.ejemplo2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R



    class Saludo : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_saludo)
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
            val etName = findViewById<AppCompatEditText>(R.id.edtName)
            btnStart.setOnClickListener{
                var name = etName.text.toString()
                if (name.isNotEmpty()) {
                    val intent = Intent(this, Resultado::class.java)
                    intent.putExtra("extra_name", name)
                    startActivity(intent)
                }
            }
        }
    }