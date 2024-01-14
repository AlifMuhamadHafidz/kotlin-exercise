package com.example.kotlinexercise

import java.util.Scanner

fun main(){
    //program to count letter, number, spaces, and other char
    var scan = Scanner(System.`in`)

    println("Please enter a sample sentence : ")
    var sentence = scan.nextLine()
    count(sentence)

}

fun count(word: String){
    var chara = word.toCharArray()

    var letter = 0
    var num = 0
    var spaces = 0
    var others = 0

    for (i in chara.withIndex()){
        if(Character.isLetter(i.value)){
            letter++
        }else if (Character.isDigit(i.value)){
            num++
        }else if (Character.isSpaceChar(i.value)){
            spaces++
        }else{
            others++
        }
    }

    print("letter count : $letter \n num count : $num \n spaces count : " +
            "$spaces \n others count : $others")
}