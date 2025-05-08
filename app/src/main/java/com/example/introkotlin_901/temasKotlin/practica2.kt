package com.example.introkotlin_901.temasKotlin
import kotlin.math.sqrt

fun main() {
    var repetir: String
    do {
        println("Fórmula general: ax² + bx + c = 0")
        print("Ingresa a: ")
        val a = readln().toDouble()
        print("Ingresa b: ")
        val b = readln().toDouble()
        print("Ingresa c: ")
        val c = readln().toDouble()

        val discriminante = b * b - 4 * a * c

        if (discriminante < 0) {
            println("No tiene soluciones reales.")
        } else {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Soluciones: x1 = $x1, x2 = $x2")
        }

        print("¿Quieres resolver otra ecuación? (si/no): ")
        repetir = readln().lowercase()
    } while (repetir == "si")
}

