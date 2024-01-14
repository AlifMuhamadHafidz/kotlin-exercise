package com.example.kotlinexercise

import java.util.Scanner

fun main(){
    var x = Scanner(System.`in`)
    print("enter the first number : ")
    var firstNumber = x.nextInt()
    print("enter the second number : ")
    var secondNumber = x.nextInt()

    val divider = firstNumber / secondNumber
    val modulus = firstNumber % secondNumber

    println("divider result : $divider")
    println("modulus result : $modulus")
}