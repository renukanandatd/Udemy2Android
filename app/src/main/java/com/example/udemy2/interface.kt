package com.example.udemy2

fun main(){
    val person1:restuarant=LocalRestuarant()
    person1.orderFood()
    person1.bill()
    val person2:restuarant=FancyRestuarant()
    person2.orderFood()
    person2.bill()
}

interface restuarant{
    fun orderFood()
    fun bill()
}
class LocalRestuarant:restuarant{
    override fun orderFood(){
        println("I want a cheese berger and french fries")
    }
    override fun bill(){
        println("I want a bill")
    }
}

class FancyRestuarant:restuarant{
    override fun orderFood(){
        println("I want a cheese berger")
    }
    override fun bill(){
        println("I want a bill")
    }
}