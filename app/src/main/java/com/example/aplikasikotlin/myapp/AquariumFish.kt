package com.example.aplikasikotlin.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class Shark : FishAction, FishColor {
    override val color = "grey"

    override fun eat() {
        println("The shark is hunting and eating other fish.")
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

fun main() {
    val shark = Shark()
    println("Shark color: ${shark.color}")
    shark.eat()

    val pleco = Plecostomus()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
