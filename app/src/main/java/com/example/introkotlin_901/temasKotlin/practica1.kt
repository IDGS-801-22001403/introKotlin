package com.example.introkotlin_901.temasKotlin

import kotlin.math.PI

fun main(){
    var opciones = 0
    do {
        println("Selecciona la figura del area:")
        println("1.Circulo")
        println("2.Cuadrado")
        println("3.Triangulo")
        println("4.Pentagono")
        println("5.Salir")
        print("selecciona una opcion")
        opciones = readln().toInt()
        when (opciones) {
        1 -> {
            println("Dame el radio del circulo:")
            val radio = readln().toInt()
            println("El area del circulo es ${PI * radio * radio}")
        }
        2 ->{
            println("Dame la medida de su lado:")
            val lado = readln().toInt()
            println("El area del cuadrado es ${lado * lado}")
        }
        3 -> {
            println("Dame la base")
            val base = readln().toInt()
            println("Dame la altura")
            val altura = readln().toInt()

            println("La area del traingulo es ${(base * altura) /2}")
        }
        4 -> {
            println("Dame la medida de su lado")
            val lado = readln().toInt()
            println("Dame su apotema")
            val apotema = readln().toInt()
            println("El area del pentagono es ${(lado * 5 * apotema)/2 }")
        }
        5 -> {
            println("Okey hasta luego")
            println("Adios")
        }

        }
    } while (opciones != 5)

}