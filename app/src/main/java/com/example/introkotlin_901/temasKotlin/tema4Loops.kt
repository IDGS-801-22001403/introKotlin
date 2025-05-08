package com.example.introkotlin_901.temasKotlin

//tema4Loops
fun main(){
    for(number in 1..5){
        println(number)
    }
    val nombres = listOf("Ronald", "Lupe", "Veronica", "Mario")

    for(nombre in nombres){
        println(nombre)
    }

    // while do-while
    var x = 0
    while (x < 5){
        println(x)
        x++
    }

    do{
        println(x)
        x++
    }while(x<5)
}