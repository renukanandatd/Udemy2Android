package com.example.udemy2

fun main(){
    val table1=Table()
    val table2=Table(7)
    val table3=Table(7,10)
    table1.features()
    table2.features()
    table3.features()
}

class Table{
    constructor(){
        legs=4
        height=5
    }
    constructor(leg:Int,high:Int){
        legs=leg
        height=high
    }
    constructor(leg:Int){
        legs=leg
        height=5
    }
    var legs:Int=4
    var height:Int=5

    fun features(){
        println("This table has $legs and height of this table is $height")
    }
}