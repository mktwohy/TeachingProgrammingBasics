/* Assignment 1
Topics:
- variables
- using temp variables
- string interpolation

In this assignment, you will practice swapping around variable values. Create three integer variables: a,b,c.
Initialize each of them to have a different value. Print out the initial values. Depending on the values you pick, your
output should look something like this:

Initially: a is 10, b is 9, c is 8

Without hard-coding numbers, swap the values so that b gets a, c gets b, and a gets c. Then, print the results of the
swap. Example output:

After first swap: a is 8, b is 10, c is 9

Swap and print one last time. Example output:

After second swap: a is 9, b is 8, c is 10

 */
fun main() {
    // declare variables to temporarily store values of b and c
    var tempB: Int
    var tempC: Int

    // declare and initialize variables to store values of a, b, and c
    var a: Int = 10
    var b: Int = 9
    var c: Int = 8

    println("Initially: a is $a, b is $b, c is $c")

    // first swap (b gets a, c gets b, a gets c)
    tempB = b   // store b's original value in temporary variable
    b = a       // b gets a
    tempC = c   // store c's original value in temporary variable
    c = tempB   // c gets b's original value
    a = tempC   // a gets c's original value

    println("After first swap: a is $a, b is $b, c is $c")

    // second swap (b gets a, c gets b, a gets c)
    tempB = b   // store b's original value in temporary variable
    b = a       // b gets a
    tempC = c   // store c's original value in temporary variable
    c = tempB   // c gets b's original value
    a = tempC   // a gets c's original value

    println("After second swap: a is $a, b is $b, c is $c")
}