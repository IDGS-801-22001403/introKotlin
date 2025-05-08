package com.example.introkotlin_901.temasKotlin

fun main(){
    println("Hola Mundo")
    val nombre =  "Christian"//val es inmutable
    var apellido = "Arrona" // Var es mutable

    println(nombre + " " +apellido)
    println( "Hola $nombre $apellido")

    var num1 = 10
    println("La suma de $num1 + 2 es ${num1 + 2}")

    num1 =num1+3
    num1 +=4
    num1++
    println(num1)

    var sueldo:Float=12.25f
    val precio:Double=20.5
    val mayorEdad:Boolean=true
    val estadoCivil:Char='S'



}