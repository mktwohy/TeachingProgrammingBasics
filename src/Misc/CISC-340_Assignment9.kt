package Misc

// Amdahl's Law: maximum speedup = 1 / (s + (1-s)/n)
fun main() {
    var loop = true
    while(loop){
        var n: Int
        do {
            n = getIntInput("Enter number of processors: ")
        } while(n < 0)

        if (n == 0) return

        var s: Float
        do {
            s = getFloatInput("Enter the % of the program that runs serially: ")
        } while(s !in 1f..99f)

        val speedup = calcSpeedup(n.toFloat(), s)

        println("Speedup: $speedup")

        loop = getBooleanInput("try again?")
    }
}

fun calcSpeedup(n: Float, s: Float): Float {
    var speedup = 1f
    speedup -= s
    speedup /= n
    speedup += s
    speedup = 1f / speedup
    return speedup
}