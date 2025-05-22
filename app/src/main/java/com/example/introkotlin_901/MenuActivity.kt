package com.example.introkotlin_901

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.cinepolis.Cinepolis
import com.example.introkotlin_901.ejemplo1.Operaciones
import com.example.introkotlin_901.ejemplo2.Resultado

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnResultado = findViewById<Button>(R.id.btn2)

        btnSaludo.setOnClickListener{navegateToSaludo()

        }
        btnResultado.setOnClickListener {
            navegateToResultado()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSaludo(){
        val intent = Intent(this, Cinepolis::class.java)
        startActivity(intent)
    }
    private fun navegateToResultado(){
        val intent = Intent(this, Resultado::class.java)
        startActivity(intent)
    }
}