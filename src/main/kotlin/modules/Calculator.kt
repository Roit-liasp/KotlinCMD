package com.turashift.kotlincmd.modules

fun calc_work() {

    //Variables
    val Num1 = readln().toDoubleOrNull()
    val Char = readln()
    val Num2 = readln().toDoubleOrNull()

    //Input validation
    if (Num1 != null && Num2 != null) {

        //Command processing
        when (Char) {

            "+" -> println(Num1 + Num2)

            "-" -> println(Num1 - Num2)

            "*" -> println(Num1 * Num2)

            "/", ":" -> {

                if (Num2 != 0.0) {

                    println(Num1 / Num2)

                } else {

                    println("Input error! Division by zero: $Num1 / \'$Num2\'")

                }

            }

            else -> println("Input error! Non-existent character: $Char")

        }

    } else {

        println("Error in one of the numerical inputs: Num1: $Num1 or Num2: $Num2")

    }

}

fun calc () {

    //Variables
    var input: String

    //Main program loop
    while (true) {

        calc_work()

        //Request to continue function execution
        print("Continue? [Y/n] ")
        input = readln()

        //Command processing
        when (input) {

            "Y", "y" -> {}

            "N", "n" -> break

            else -> {
                print("Exit cancelled due to user input error.")
            }

        }

    }

}

const val CALC_COMMAND = "calc"
