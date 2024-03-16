package com.example.aplikasikotlin.myapp

import kotlin.math.PI

open class Aquarium(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water: Double = 0.0
        get() = volume * 0.9

    open val shape = "rectangle"
}

fun Aquarium.printSize() {
    println(shape)
    println("Width: $width cm, Length: $length cm, Height: $height cm")
    println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
class TowerTank(override var height: Int, diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height * PI / 1000).toInt() // Perbaiki perhitungan volume
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}
