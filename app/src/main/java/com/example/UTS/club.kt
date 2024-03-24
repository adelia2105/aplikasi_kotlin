package com.example.UTS
data class Club(
    val nama: String,
    val ligaPrimerInggris: Int,
    val faCup: Int,
    val eflCup: Int,
    val ligaChampionsEropa: Int,
    val ligaEropaUEFA: Int
) {
    val totalTrophies: Int
        get() = ligaPrimerInggris + faCup + eflCup + ligaChampionsEropa + ligaEropaUEFA
}

