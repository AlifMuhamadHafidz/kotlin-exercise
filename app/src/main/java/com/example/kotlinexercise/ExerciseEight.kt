package com.example.kotlinexercise

import java.util.Scanner

fun main(){
    var scan = Scanner(System.`in`)
    print("first number : ")
    var first = scan.nextInt()
    print("second number : ")
    var second = scan.nextInt()
    print("third number : ")
    var third = scan.nextInt()

    if (first > second && first > third){
        print("$first is the greatest number")
    }else if (second > first && second > third){
        print("$second is the greatest number")
    }else{
        print("$third is the greatest number")
    }
}