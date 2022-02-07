package assignmentSolutions

import Misc.getFloatInput

/* Assignment 2

Topics:
- functions
- user input
- arithmetic operators

Look back on Assignment 2A. Notice how this results in repetitive code. So, create a function called "calculateTip."
calculateTip will take the bill amount (Float) Misc.and tip percentage (Float) as an input, Misc.and will print
the tip amount Misc.and bill total after tip. The function does not return any value.

 */
fun main() {
    // get bill amount
    var bill: Float = getFloatInput("Enter bill total: ")

    calculateTip(bill, 10f)
    calculateTip(bill, 15f)
    calculateTip(bill, 20f)
}

fun calculateTip(bill: Float, tipPercent: Float){
    var tipAmount: Float = bill * (tipPercent / 100)
    println("$tipPercent% \n\ttip amount: $$tipAmount \n\tbill total after tip: $${bill + tipAmount}")
}