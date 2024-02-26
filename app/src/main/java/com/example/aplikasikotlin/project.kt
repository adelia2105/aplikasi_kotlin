package com.example.aplikasikotlin

fun main(args: Array<String>) {
    biodata("Agnes", 19)
    hobby("tidur", "ketiduran")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun hobby(hobby:String, desc:String){
    println("Saya punya hobby $hobby")
    println("Hobby tersebut adalah $desc")
}