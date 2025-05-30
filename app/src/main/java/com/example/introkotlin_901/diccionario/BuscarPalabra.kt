package com.example.introkotlin_901.diccionario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R
import java.io.File

class BuscarPalabra : AppCompatActivity() {
    private val fileName = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_palabra)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val etPalabra = findViewById<EditText>(R.id.etBuscar)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnBuscar.setOnClickListener {
            val palabra = etPalabra.text.toString().trim()
            val buscarEnIngles = radioGroup.checkedRadioButtonId == R.id.rbIngles

            val resultado = buscarPalabra(palabra, buscarEnIngles)
            tvResultado.text = resultado
        }

        btnVolver.setOnClickListener {
            finish()
        }


    }
    private fun buscarPalabra(palabra: String, enIngles: Boolean): String {
        val file = File(filesDir, fileName)
        if (!file.exists()) return "Archivo no encontrado"

        val lineas = file.readLines()
        for (linea in lineas) {
            val partes = linea.split(":")
            if (partes.size == 2) {
                val esp = partes[0].trim()
                val ing = partes[1].trim()
                if ((enIngles && ing.equals(palabra, ignoreCase = true)) ||
                    (!enIngles && esp.equals(palabra, ignoreCase = true))
                ) {
                    return if (enIngles) esp else ing
                }
            }
        }
        return "Palabra no encontrada"
    }
}









