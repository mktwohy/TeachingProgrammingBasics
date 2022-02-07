package codeInGame

import java.util.*

fun String.repeat(times: Int): String {
    val sb = StringBuilder()
    repeat(times){
        sb.append(this)
    }
    return sb.toString()
}

fun String.parseBinaryChunks(): List<String>{
    return listOf()
}

fun encode(bit: Boolean, chunkSize: Int): String{
    val bitStr = if (bit) "0" else "00"
    return "$bitStr ${"0".repeat(chunkSize)}"
}

fun <T> List<T>.chunkConsecutive(): List<List<T>>{
    val ret = mutableListOf<List<T>>()
    val curList = mutableListOf<T>()

    this.forEach {
        if (it !in curList && curList.isNotEmpty()){
            ret += curList.toList()
            curList.clear()
        }
        curList += it
    }
    if (curList.isNotEmpty())
        ret += curList.toList()

    return ret
}

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val MESSAGE = input.nextLine()

    val binaryMsg = MESSAGE.map{ it.code.toString(2) }
    System.err.println("binaryMsg: $binaryMsg")

    val chunkedMsg = binaryMsg.toList().chunkConsecutive().map { it[0].toInt() to it.size}
    System.err.println("chunkedMsg: $chunkedMsg")

    val encodedMsg = chunkedMsg.map { (bit, chunkSize) ->
        encode(bit == 1, chunkSize)
    }.joinToString(separator = "")

    // Write an answer using println()
    // To debug: System.err.println("Debug messages...");

    println(encodedMsg)
}
