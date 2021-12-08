package assignmentSolutions

import getFloatInput

/* Assignment 2

Topics:
- user input
- arithmetic operators
- string interpolation

Calculate the tip on a bill. You should have one variable that holds the bill total. Then you should calculate tips for
10%, 15%, and 20%. Additionally, report the tip amount and bill+tip total for each percentage.

 */
fun main() {
    // get bill amount
    var bill: Float = getFloatInput("Enter bill total: ")

    // calculate tips for each percentage
    var tip10: Float = bill * 0.10f
    var tip15: Float = bill * 0.15f
    var tip20: Float = bill * 0.20f

    // print results to console
    println("Bill: $$bill")
    println("10% \n\ttip amount: $$tip10 \n\tbill total after tip: $${bill + tip10}")
    println("15% \n\ttip amount: $$tip15 \n\tbill total after tip: $${bill + tip15}")
    println("20% \n\ttip amount: $$tip20 \n\tbill total after tip: $${bill + tip20}")
}