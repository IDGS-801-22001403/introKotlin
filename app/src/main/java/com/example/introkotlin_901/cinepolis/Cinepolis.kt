package com.example.introkotlin_901.cinepolis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class Cinepolis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)
        val etCompradores = findViewById<EditText>(R.id.etCompradores)
        val etBoletos = findViewById<EditText>(R.id.etBoletos)
        val rgTarjeta = findViewById<RadioGroup>(R.id.rgTarjeta)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)

        btnCalcular.setOnClickListener {
            val compradores = etCompradores.text.toString().toIntOrNull() ?: 0
            val boletos = etBoletos.text.toString().toIntOrNull() ?: 0

            if (compradores <= 0) {
                Toast.makeText(this, "Ingrese al menos 1 comprador", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val limiteBoletos = 7 * compradores



            if (boletos <= 0 || boletos > limiteBoletos) {
                Toast.makeText(this, "Ingrese una cantidad entre 1 y $limiteBoletos boletos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val usaTarjeta = when (rgTarjeta.checkedRadioButtonId) {
                R.id.rbSi -> true
                R.id.rbNo -> false
                else -> false
            }

            val total = calcularTotal(boletos, usaTarjeta)
            tvTotal.text = "Total a pagar: $${"%.2f".format(total)}"
        }


    }



    fun calcularTotal(boletos: Int, usaTarjeta: Boolean): Double {
        val precioBoleta = 12.0
        var total = boletos * precioBoleta


        val descuentoCantidad = when {
            boletos > 5 -> 0.15
            boletos in 3..5 -> 0.10
            else -> 0.0
        }

        total -= total * descuentoCantidad

        if (usaTarjeta) {
            total -= total * 0.10
        }

        return total
    }

}

