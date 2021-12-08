/**
 * Function to get Float input from user
 * @param message prompt that will be printed before user inputs their answer
 * @return Float value that user inputs
 */
fun getStringInput(message: String): String{
    print(message)
    return readLine()!!
}

/**
 * Function to get Float input from user
 * @param message prompt that will be printed before user inputs their answer
 * @return Float value that user inputs
 */
fun getFloatInput(message: String): Float{
    print(message)
    return readLine()!!.toFloat()
}

/**
 * Function to get Int input from user
 * @param message prompt that will be printed before user inputs their answer
 * @return Int value that user inputs
 */
fun getIntInput(message: String): Int{
    print(message)
    return readLine()!!.toInt()
}

/**
 * Function to get Char input from user
 * @param message prompt that will be printed before user inputs their answer
 * @return Char value that user inputs
 */
fun getCharInput(message: String): Char{
    print(message)
    return readLine()!!.toCharArray()[0]
}