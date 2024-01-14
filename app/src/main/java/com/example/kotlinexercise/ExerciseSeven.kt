package com.example.kotlinexercise

fun main(){
    //odd and even number counter
    var array = arrayOf(1,2,22,4,5,6)
    var oddCounter = 0
    var evenCounter = 0

    for (i in array){
        if (i % 2 == 0){
            evenCounter++
        }else{
            oddCounter++
        }
    }

    println("odd number is : $oddCounter, even number is : $evenCounter")
}