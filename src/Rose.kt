

fun main() {
    var x: Int  // declaration
    x = 3       // initialization
    println(x)
    x = 5
    println(x)

    // create a variable called myString of type String
    // initialize it with "Hello World!"
    // print it

    var myString: String
    myString = "Hello World!"
    myString = "3"
    println(myString)

    var age: Int
    var hasFakeID: Boolean
    var canDrink: Boolean
    age = 21
    hasFakeID = false
    canDrink = age >= 21 || hasFakeID

    if (canDrink){
        println("Come in, have a drink!")
    }
    else {
        println("Get outta here!")
    }


    var hasBachelors: Boolean
    var hasMasters: Boolean
    var canWorkInLibrary: Boolean
    hasBachelors = false
    hasMasters = false
    canWorkInLibrary = hasBachelors && hasMasters
    if (canWorkInLibrary){
        println("you can work in our library")
    }
    else {
        println("find a different job")
    }

/*
Arithmetic
    add: +
    subtract: -
    multiply: *
    divide: /
    modulus: %
Boolean
    equal: ==
    not equal: !=
    less than: <
    less than or equal <=
    greater than: >
    greater than or equal: >=
*/
}