package com.example.udemy2

fun main(){
    var user1=Jetpack()
    user1.userHeight=10
    user1.seconds=3

    user1.burn(user1.userHeight,user1.seconds)
    user1.stop(user1.userHeight,5)
}

class Jetpack(){
    var userHeight=0
    var seconds=0

    fun burn(userHeight:Int,seconds:Int){
        if(userHeight>0){
            if((userHeight+(1*seconds))>0) {
                println("User height has been increased to ${userHeight+(1*seconds)}")
            }
        }
    }

    fun stop(userHeight: Int,seconds: Int){
        if(userHeight>0){
            if((userHeight-(3*seconds))>0) {
                print("User height is decreased to ${userHeight-(3*seconds)}")
            }
        }
    }
}