package com.example.aplikasikotlin.myapp

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
    }

fun main () {
    makeFish()
}
fun main() {
    val shark = Shark()
    println("Shark color: ${shark.color}")
    shark.eat()

    val pleco = Plecostomus()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()
}