package com.example.kotlinexercise

import java.util.Scanner

fun main(){
    //swap variable value
    var temp: Int

    var scan = Scanner(System.`in`)

    print("enter first number : ")
    var a = scan.nextInt()
    print("enter second number : ")
    var b = scan.nextInt()

    temp = a
    a = b
    b = temp

    println("first number value : $a, second number value : $b")


}