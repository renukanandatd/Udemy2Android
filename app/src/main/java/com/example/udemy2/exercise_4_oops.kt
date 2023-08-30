package com.example.udemy2

fun main(){
    var calc=Calculator()
    calc.add()
    calc.sub()
}

class Calculator(){
    var total=100
    fun add(){
        total+=20
        println(total)
    }
    fun sub(){
        total-=20
        println(total)
    }
}