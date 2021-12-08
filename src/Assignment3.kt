import kotlin.random.Random
import Color.*
/*
For this assignment, you will be building a simple game of rock-paper-scissors. In our implementation of this game,
1 corresponds to rock, 2 to paper, and 3 to scissors.

The computer will randomly choose a number between 1 and 3. Then, you will ask the user to input a value
between 1 and 3. Use this information to determine if the user won, lost, or tied, and then display (print) these
results to the user. Finally, ask the user if they want to play again or quit. If they want to play again, run the game
again. If they want to quit, the program should tell the user how many times they won or lost, as well as displaying a
win percentage.

Topics:
- arithmetic operators
- incrementing variables
- imports
- nested if/else/else if statements
- while loops
    - including using them for input error checking
- nullable types

use this line of code to generate computer's throw:
var compThrow: Int = Random.nextInt(1, 4) // generate random number that could be 1, 2, or 3

 */


enum class Color{
    RED,
    YELLOW,
    BLUE,
}

fun nextColor(color: Color) =
    when(color){
        RED     -> YELLOW
        YELLOW  -> BLUE
        BLUE    -> RED
    }

fun main() {
    var color = RED

    repeat(10){
        println(color)
        color = nextColor(color)

    }
}

