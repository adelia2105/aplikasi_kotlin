package com.example.aplikasikotlin.myapp.decor
data class Decoration(val rocks: String)
fun makeDecorations() {

    val decoration1 = Decoration("granite")
    println(decoration1)


    val decoration2 = Decoration("slate")
    println(decoration2)


    val decoration3 = Decoration("slate")
    println(decoration3)


    println(decoration1 == decoration2)
    println(decoration3 == decoration2)


    val rock = decoration1.rocks
    println(rock)


    data class Decoration2(val rocks: String, val wood: String, val diver: String)


    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)


    val (rock2, wood, diver) = d5
    println(rock2)
    println(wood)
    println(diver)
}

fun main() {
    makeDecorations()
}
