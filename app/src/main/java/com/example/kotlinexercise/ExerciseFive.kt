package com.example.kotlinexercise

import java.util.Scanner

fun main() {
    //program to reverse a string
    var scan = Scanner(System.`in`)
    print("Enter a string : ")
    var word = scan.nextLine().toCharArray()
    var reverse = ""
    var foreachReverse = ""
    //for loop
    for (i in word.size -1 downTo 0) {
        reverse += word[i]
    }

    //foreach
    word.forEach { char ->
        foreachReverse = char + foreachReverse
    }

    println("reversed string : $reverse and for each reversed string: $foreachReverse")
}