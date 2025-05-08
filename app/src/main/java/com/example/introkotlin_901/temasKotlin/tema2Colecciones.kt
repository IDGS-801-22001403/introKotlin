package com.example.introkotlin_901.temasKotlin
fun main(){
    /*
    List, MutableList
    set, MutableSet
    Map, MutableMap
     */

    var readOnlyList:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(readOnlyList)
    println("El primer dia es ${readOnlyList[0]}")
    println("El primer dia es ${readOnlyList.first()}")
    println("El numero de dias es: ${readOnlyList.count() }")
    println("el numero de dias es: ${readOnlyList.size}")

    println("Martes" in readOnlyList)

    var figuras:MutableList<String> = mutableListOf("Circulo", "Cuadrado","Triangulo")
    println(figuras)
    figuras.add("Pentagono")
    println(figuras)
    figuras.removeAt(0)
    println(figuras)
    figuras.remove("Cuadrado")

    //----------------------------------------------------------------------------------------------------------//

    val readOnlyFrutas= mapOf("Manzanas" to 500, "Platano" to 2000, "Sandia" to 2500)
    println(readOnlyFrutas)
    println(readOnlyFrutas["Manzanas"])
    println(readOnlyFrutas.keys)
    println(readOnlyFrutas.values)


}