package Misc

fun main() {
    // create password variable (String)
    var password: String
    // create variable for storing user input (String)
    var userInput: String


    // fill password variable with a password
    password = "password"
    // get String input from user (have them enter password)
    userInput = "password"

    // if the password Misc.and input are the same, print "logging in". otherwise, print "incorrect password"
    if (userInput == password){
        print("logging in")
    }
    else {
        print("incorrect password")
    }
}