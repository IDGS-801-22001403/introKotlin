package com.example.introkotlin_901.diccionario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class AgregarPalabra : AppCompatActivity() {
    private val fileName = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_palabra)

        val etEspanol = findViewById<EditText>(R.id.etEspanol)
        val etIngles = findViewById<EditText>(R.id.etIngles)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnGuardar.setOnClickListener {
            val esp = etEspanol.text.toString().trim()
            val ing = etIngles.text.toString().trim()

            if (esp.isNotEmpty() && ing.isNotEmpty()) {
                val entry = "$esp:$ing\n"
                openFileOutput(fileName, MODE_APPEND).use {
                    it.write(entry.toByteArray())
                }
                Toast.makeText(this, "Palabras guardadas con éxito", Toast.LENGTH_SHORT).show()
                etEspanol.text.clear()
                etIngles.text.clear()
            }
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
