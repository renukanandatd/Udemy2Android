package com.example.udemy2

fun main(){
    var lap=Laptop()
    lap.run()
    var top=Apple()
    top.speed=5
    top.run()
}

open class Laptop{
    var screenSize=10
    var speed=100

    fun run(){
        println("This laptop has screen size of $screenSize and works with a speed of $speed")
    }
}

class Apple: Laptop() {
}