package com.example.practice3_day1

fun main(){
    val num = 10

    print("Guess a number between 0 and 10: ")
    try {
        val num1 = readLine()!!.toInt()
        if(num1 == num){
            println("You got it!")
        }else if(num1<0 || num1>10){
           println("Guess a number between 0 and 10")

        }
        else{
            println("Wrong guess")
        }
    } catch (e: Exception) {
        println("Please enter numbers only.")
    }
    println("Game Over")
}