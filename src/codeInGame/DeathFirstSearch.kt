package codeInGame

// https://www.codingame.com/ide/puzzle/death-first-search-episode-1

import java.util.*
import java.io.*
import java.math.*

operator fun <T> Pair<T, T>.contains(item: T): Boolean =
    item == this.first || item == this.second


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt() // the total number of nodes in the level, including the gateways
    val L = input.nextInt() // the number of links
    val E = input.nextInt() // the number of exit gateways

    val exits = mutableListOf<Int>()
    val nodes = mutableSetOf<Int>()
    val edges = mutableSetOf<Pair<Int, Int>>()


    for (i in 0 until L) {
        val N1 = input.nextInt() // N1 Misc.and N2 defines a link between these nodes
        val N2 = input.nextInt()
        nodes += N1
        nodes += N2
        edges += Pair(N1, N2)
    }

    for (i in 0 until E) {
        val EI = input.nextInt() // the index of a gateway node
        exits += EI
    }

    val exitEdges = edges.filter { it.first in exits || it.second in exits }.toMutableList()

    // game loop
    while (true) {
        val SI = input.nextInt() // The index of the node on which the Bobnet agent is positioned this turn

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");
        // val bobEdges = edges.filter { SI in it }

        val bobExits = edges.filter{ SI in it }.filter{ it.first in exits || it.second in exits }

        val link = if (bobExits.isNotEmpty()) bobExits.random() else exitEdges.random()

        // Example: 0 1 are the indices of the nodes you wish to sever the link between
        println("${link.first} ${link.second}")
    }
}

//import java.util.*
//
//
//operator fun <T> Pair<T, T>.contains(item: T): Boolean =
//    item == this.first || item == this.second
//
//fun dfs(bob: Int): List<Pair<Int, Int>>{
//
//    val visited = nodes.associateWith { false }.toMutableMap()
//    val bobsNetwork = mutableListOf<Pair<Int, Int>>()
//
//    fun explore(node: Int){
//        visited[node] = true
//
//        val neighbors = edges
//            .filter { edge -> node in edge }
//            .map { edge -> if (edge.first == node) edge.second else edge.first }
//
//        for (neighbor in neighbors){
//            if (visited[neighbor] != false){
//                explore(node)
//            }
//        }
//    }
//
//    explore(bob)
//
//    return bobsNetwork
//}
//
//val edges = mutableListOf<Pair<Int, Int>>()
//val exits = mutableListOf<Int>()
//val nodes = mutableSetOf<Int>()
//
///**
// * Auto-generated code below aims at helping you parse
// * the standard input according to the problem statement.
// **/
//fun Misc.main(args : Array<String>) {
//    val input = Scanner(System.`in`)
//    val N = input.nextInt() // the total number of nodes in the level, including the gateways
//    val L = input.nextInt() // the number of links
//    val E = input.nextInt() // the number of exit gateways
//
//
//
//    for (i in 0 until L) {
//        val N1 = input.nextInt() // N1 Misc.and N2 defines a link between these nodes
//        val N2 = input.nextInt()
//        edges += Pair(N1, N2)
//        nodes += N1
//        nodes += N2
//    }
//
//    for (i in 0 until E) {
//        val EI = input.nextInt() // the index of a gateway node
//        exits += EI
//    }
//
//    // game loop
//    while (true) {
//        val SI = input.nextInt() // The index of the node on which the Bobnet agent is positioned this turn
//
//        // Write an action using println()
//        // To debug: System.err.println("Debug messages...");
//        val bobsNetwork = dfs(SI)
//
//
//
//        // Example: 0 1 are the indices of the nodes you wish to sever the link between
//        println("0 1")
//    }
//}

