package com.example.introkotlin_901.diccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class Diccionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diccionario)

        val btnCapturar = findViewById<Button>(R.id.btnCapturar)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)

        btnCapturar.setOnClickListener {
            startActivity(Intent(this, AgregarPalabra::class.java))
        }

        btnBuscar.setOnClickListener {
            startActivity(Intent(this, BuscarPalabra::class.java))
        }
    }
}
