package com.example.kotlinexercise

fun main(){
    // program to multiply each array element with other array in same index
    var arrayOne = arrayOf(1,4,-5,2)
    var arrayTwo= arrayOf(1,-3,-5,-8)
    var result = ""



    for (i in arrayOne.withIndex()){
        result += (arrayOne[i.index] * arrayTwo[i.index])
        result += ","
    }

    println("the result [$result]")
}