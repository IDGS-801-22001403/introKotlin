package com.example.introkotlin_901.temasKotlin


fun main() {
    var numero: Int
    do {
        print("Ingresa un número para la altura de la pirámide: ")
        numero = readln().toInt()
    } while (numero <= 0)

    var i = 1
    do {
        val espacios = " ".repeat(numero - i)
        val asteriscos = "*".repeat(i * 2 - 1)
        println(espacios + asteriscos)
        i++
    } while (i <= numero)
}