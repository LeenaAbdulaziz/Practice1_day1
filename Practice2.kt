package com.example.practice2_day1

fun main(){
    val minAge = 25
    print("Enter your age:  ")
    val userAge = readLine()
    try {
        if(userAge!!.toInt() >= minAge){
            println("Welcome!")
        }else{
            println("You are not old enough...")
        }
    } catch (e: Exception) {
        println("Please enter numbers only.")
    }
}