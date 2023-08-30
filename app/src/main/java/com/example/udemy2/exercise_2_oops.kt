package com.example.udemy2

fun main(){
    var matt=Math()
    matt.add(1,2)
    matt.subtract(3,2)
    matt.multiply(45,23)
    matt.divide(4.0,3.0)
}

class Math{
    var input1=0
    var input2=0

    fun add(input1:Int,input2:Int){
        println("Result = ${input1+input2}")
    }
    fun subtract(input1:Int,input2:Int){
        println("Result = ${input1-input2}")
    }
    fun multiply(input1:Int,input2:Int){
        println("Result = ${input1*input2}")
    }
    fun divide(input1:Double,input2:Double){
        print("Result = ${input1/input2}")
    }
}