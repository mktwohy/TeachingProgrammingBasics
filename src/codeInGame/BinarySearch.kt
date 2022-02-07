package codeInGame


fun <T> List<T>.binarySearch(item: T): Int? where T: Comparable<T>{
    var start = 0
    var end = this.size - 1

    while(start <= end){
        val midIndex = start + (end - 1) / 2
        val mid = this[midIndex]

        when {
            mid < item -> start = midIndex + 1
            mid > item -> end = midIndex - 1

            mid == item ->
                return midIndex
        }
    }
    return null
}

/**
 * returns index of item in list, or null if item is not in list
 */
//fun List<Int>.binarySearch(item: Int): Int?{
//
//}

fun main() {
    val list = listOf(1,2,3,4)
    println(list.binarySearch(1))
}