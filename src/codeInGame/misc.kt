package codeInGame

fun Int.coerceIn(range: ClosedRange<Int>): Int =
    when {
        this > range.endInclusive -> range.endInclusive
        this < range.start -> range.start
        else -> this
    }

fun assert(that: Boolean){
    if (that) println("PASS") else println("FAIL")
}

fun <T> assertEquals(actual: T, expected: T){
    assert(actual == expected)
}


fun main() {
    assertEquals(5.coerceIn(0..10), 5)
    assertEquals(5.coerceIn(0..5), 5)
    assertEquals(5.coerceIn(0..4), 4)
    assertEquals(5.coerceIn(4..10), 5)
    assertEquals(5.coerceIn(5..10), 5)
    assertEquals(5.coerceIn(6..10), 6)
}