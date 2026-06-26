package com.turashift.kotlincmd

//Importing commands
import com.turashift.kotlincmd.modules.EXIT_COMMAND
import com.turashift.kotlincmd.modules.CALC_COMMAND

//Importing functions from modules
import com.turashift.kotlincmd.modules.exit
import com.turashift.kotlincmd.modules.calc

fun main() {

    //Variables
    var exit_Output = false

    //Main program loop
    while (exit_Output == false) {

        //Command promt
        println()
        print("kcmd ~# ")

        //Read command
        var command = readln()

        //Command processing
        when(command) {

            HELP_COMMAND -> {
                println("help - displays available commands.")
                println("$EXIT_COMMAND - closes the terminal after confirmation.")
                println("$CALC_COMMAND - launches the calculator.")
            }

            EXIT_COMMAND -> exit_Output = exit()

            CALC_COMMAND -> calc()

            else -> println("Unknown command: $command.")

        }

    }

}

const val HELP_COMMAND = "help"


/*
Hi!
I wrote this pseudo-terminal while learning Kotlin.
There might be some bugs, but I think it turned out pretty well!
I created it to implement a concept that allows users to load their own plugin files (in .jar format).
I plan to keep developing this project! Programmer and author: Pavel Mizev.

Please don't hold any potentially incorrect English against me;
I’m a Russian programmer and don't speak the language, so I used Google Translate for all the English text.
 */
