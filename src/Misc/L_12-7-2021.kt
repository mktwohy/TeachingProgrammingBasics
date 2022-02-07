package Misc

fun main() {
    // create 3 variables:
    // age, which is type Int
    var age: Int
    // hasFakeID, which is Boolean
    var hasFakeID: Boolean
    // canEnterBar, which is Boolean
    var canEnterBar: Boolean

    // assign values to variables
    // age gets 20
    age = 21
    // hasFakeID gets true
    hasFakeID = false
    // canEnterBar gets (age is greater or equal to 21) or (they have a fake)
    canEnterBar = age >= 21 || hasFakeID

    if (canEnterBar){
        println("come on in!")
    }
    else {
        println("get outta here!")
    }
}

