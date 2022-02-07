package codeInGame

import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt() // Number of elements which make up the association table.
    val Q = input.nextInt() // Number Q of file names to be analyzed.


    val extToMime = mutableMapOf<String, String>().apply {
        for (i in 0 until N) {
            val EXT = input.next() // file extension
            val MT = input.next() // MIME type.
            this[EXT] = MT
        }
    }
    System.err.println(extToMime)

    input.nextLine()

    // for (i in 0 until Q) {
    //     val FNAME = input.nextLine() // One file name per line.
    // }
    val fileNames = List<String>(Q){ input.nextLine() }

    // Write an answer using println()
    // To debug: System.err.println("Debug messages...");


    // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    for (file in fileNames) {
        val mime =
            if ("." in file){
                val ext = file.split(".").last()
                extToMime[ext]?: "UNKNOWN"
            }
            else {
                "UNKNOWN"
            }

        System.err.println(file)
        println(mime)
    }
}