package com.example.udemy2

//Exercise1
fun main(){
    var lion=animal()
    lion.topSpeed=140
    lion.name="Lion"
    lion.run(lion.topSpeed,lion.name)
}

class animal{
    var topSpeed=100
    var name="Dog"

    fun run(topSpeed:Int,animal:String){
        println("Top speed of $animal is $topSpeed")
    }
}