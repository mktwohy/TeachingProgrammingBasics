package codeInGame

import java.util.*
import java.io.*
import java.math.*



// https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val W = input.nextInt() // width of the building.
    val H = input.nextInt() // height of the building.
    val N = input.nextInt() // maximum number of turns before game over.
    val X0 = input.nextInt()
    val Y0 = input.nextInt()

    var x = X0
    var y = Y0

    var xStart = x
    var xEnd = W - 1

    var yStart = y
    var yEnd = H - 1

    // game loop
    while (true) {
        val bombDir = input.next() // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");
        val xMid = xStart + (xEnd - 1) / 2
        val yMid = yStart + (yEnd - 1) / 2

        when {
            'R' in bombDir -> xStart = xMid + 1
            'L' in bombDir -> xEnd = xMid - 1
        }

        when {
            'D' in bombDir -> yStart = yMid + 1
            'U' in bombDir -> yEnd = yMid - 1
        }


        // the location of the next window Batman should jump to.
        println("$x $y")
    }
}

//import java.util.*
//import java.io.*
//import java.math.*
//
///**
// * Auto-generated code below aims at helping you parse
// * the standard input according to the problem statement.
// **/
//fun Misc.main(args : Array<String>) {
//    val input = Scanner(System.`in`)
//    val W = input.nextInt() // width of the building.
//    val H = input.nextInt() // height of the building.
//    val N = input.nextInt() // maximum number of turns before game over.
//    val X0 = input.nextInt()
//    val Y0 = input.nextInt()
//
//    var x = X0
//    var y = Y0
//
//    // game loop
//    while (true) {
//        val bombDir = input.next() // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
//
//        // Write an action using println()
//        // To debug: System.err.println("Debug messages...");
//
//        x += when {
//            'R' in bombDir -> 1
//            'L' in bombDir -> -1
//            else -> 0
//        }
//
//        y += when {
//            'D' in bombDir -> 1
//            'U' in bombDir -> -1
//            else -> 0
//        }
//
//        // the location of the next window Batman should jump to.
//        println("$x $y")
//    }
//}