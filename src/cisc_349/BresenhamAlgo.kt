package cisc_349

import java.lang.Integer.max
import java.lang.Integer.min

data class Point(val x: Int, val y: Int)

/** Prints matrix with (0,0) at bottom left */
fun <T> List<List<T>>.print2d(){
    for(row in this.reversed()){
        println(row)
    }
}

fun <T> createEmptyMatrix(width: Int, height: Int, defaultValue: T) =
    MutableList(height){
        MutableList(width){ defaultValue }
    }

fun  <T> MutableList<MutableList<T>>.drawLine(start: Point, end: Point, marker: T){
    val changeX = end.x - start.x
    val changeY = end.y - start.y

    fun bresenham(A: Int, B: Int, increment: Int = 1){
        var D   = 2*A + B
        val D0  = 2*A
        val D1  = 2*A + 2*B

        var y = start.y
        for (x in start.x..end.x){
            this[y][x] = marker

            if (D <= 0){
                D += D0
            }
            else {
                y += increment
                D += D1
            }
        }
    }

    bresenham(A = changeY, B = -changeX, increment = 1)
}

fun main() {
    val m = createEmptyMatrix(100, 100, '_')
    val start = Point(1,2)
    val end = Point(70,40)

    m[start.y][start.x] = 'X'
    m[end.y][end.x] = 'X'

    println("Input: ")
    m.print2d()

    println("\nOutput: ")
    m.drawLine(start, end, '#')
    m.print2d()
}


