package com.example.kotlinexercise

import java.util.Scanner

fun main(){

    var scan = Scanner(System.`in`)

    print("please enter a radius : ")
    var radius = scan.nextInt()
    var phi : Double = 3.1415
    var peri : Double = 2 * phi * radius
    var area : Double = radius * radius * phi

    println("the area : $area, the perimeter : $peri")
}