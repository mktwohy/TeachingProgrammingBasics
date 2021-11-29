# Hello World
```kotlin
fun main(){
    println("Hello World!")
}
```

# Variables
- There are three questions to ask when declaring a variable
    1. __Name:__ what do we call this thing?
    1. __Type:__ what type of data does it contain?
    1. __Value:__ what is it's initial (starting) value?
- This questions are often broken into two steps:
    - Declaration
        - questions 1 & 2
        - ```kotlin
        // General ("create a box called name of type Type"):
        var name: Type
        // Example:
        var message: String
        ```
    - Initialization
        - question 3
        - ```kotlin
        // General ("name gets value"):
        name = value
        // Example:
        message = "hello world!"
        ```
    - These two steps can be combined into one line:
        - ```kotlin
        // General ("create a box called name of type Type with an initial value of value"):
        var name: Type = value
        // Example:
        var message: String = "hello world!"
        ```

# Types
- the type of a variable is decided upon declaration
- once declared, the type cannot be changed
- any value assigned to a variable must match its type
    - for example:
    - ```kotlin
    var x: Int
    x = 3               // this is ok
    x = "hello world!" // this will throw an error
    ```
- examples of some common types:
- ```kotlin
var a: Float = 3.14f
var b: Int = 14
var c: String = "Hello World!"
var d: Boolean = true
```

# Operators
- Operators are 1-2 character "functions" that evaluate 2 values to a single value
- the general format is: _value1 operator value2_

#### Arithmetic
- add: +
- subtract: -
- multiply: *
- divide: /
- modulus: %

#### Boolean
- comparators:
    - equal: ==
    - not equal: !=
    - less than: <
    - less than or equal <=
    - greater than: >
    - greater than or equal: >=
    - ```kotlin
    var age: Int = 20
    var isUnderage: Boolean = age < 21
    ```
- logic:
    - AND: &&
    - OR: ||
    - ```kotlin
    var age: Int = 20
    var hasFakeID: Boolean = true
    var canDrink: Boolean = hasFakeID || (age >= 21)
    ```
- you can also invert a Boolean value by placing a "!" ("not") in front of it
    - ```kotlin
    var age: Int = 20
    var isUnderage: Boolean = age < 21
    var isLegalAge: Boolean = !isUnderage
    ```

# Functions
- Functions allow you to reuse code and break up your program into smaller chunks
- functions can (but do not _need_ to) have:
    - 1 or more inputs (parameters)
    - 1 output (return value)
- Function Declaration
    -
    - ```kotlin
    //General:
    fun functionName(inputName: Type): ReturnType {
        // code
        return someValue
    }
    // Examples:
    fun sum(x: Int, y: Int): Int{
        return x + y
    }
    fun displayRules(){
        println("You must be 21 years old or have a fake ID")
    }
    ```

# Conditional Control Flow
## If/Else
- The code within a if-statement's scope will only execute if its condition evaluates to true
- ```kotlin
    if (canDrink){
        enterBar()
    }
    else{
        leave()
    }
```

## While loop
- a while-statement is just like an if-statement, except it will jump back up to the conditional when it reaches the end of its scope
- there are 4 components:
    1. sentry: variable that will control loop
    1. initialization: code that initializes sentry
    1. condition: loop repeats if condition is true
    1. update sentry: code to change sentry so condition can be triggered
- ```kotlin
var i: Int = 0              // declare and initialize sentry
while (i < 5){              // conditional
    println("hello world!")
    i = i + 1               // update sentry
}
```