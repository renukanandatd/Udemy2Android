package com.example.udemy2

/*fun main(){
    val one="(\\(\\"
    val two="(-.-)"
    val three="0_(\")(\")"
    println(one)
    println(two)
    println(three)
}*/

fun main(){
    printHi()
}

fun printHi(){
    fun greeting(name:String){
        println("Hi $name how are you")
    }
    println("Enter your name")
    val name= readLine()?:""
    if(name!=""){
        greeting(name)
        printHi()
    }
}