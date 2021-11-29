import kotlin.random.Random

/*
For this assignment, you will be building a simple game of rock-paper-scissors. In our implementation of this game,
1 corresponds to rock, 2 to paper, and 3 to scissors.

The computer will randomly choose a number between 1 and 3. Then, you will ask the user to input a value
between 1 and 3. Use this information to determine if the user won, lost, or tied, and then display (print) these
results to the user. Finally, ask the user if they want to play again or quit. If they want to play again, run the game
again. If they want to quit, the program should tell the user how many times they won or lost, as well as displaying a
win percentage.

Topics:
- arithmetic operators
- incrementing variables
- imports
- nested if/else/else if statements
- while loops
    - including using them for input error checking
- nullable types
 */
fun main() {
    var play: Boolean = true // sentry for while loop
    var numGames: Int = 0   // counts how many games have been played
    var numWins: Int = 0    // counts how many times the user has won

    while (play){
        // get computer's throw
        var compThrow: Int = Random.nextInt(1, 4) // generate random number that could be 1, 2, or 3

        // ask user for input. If they enter an invalid input, keep asking until they enter a valid one.
        var userThrow: Int = getIntInput("\n\nEnter 1 for rock, 2 for paper, and 3 for scissors: ")
        while(userThrow !in 1..3){
            println("\tInvalid input.")
            userThrow = getIntInput("Enter 1 for rock, 2 for paper, and 3 for scissors: ")
        }

        // create variable that tells if user won (true), lost (false), or tied (null). initialize this as false
        var win: Boolean? = false

        // look throw all combinations of user and computer throws, and assign win variable according to the case it reaches
        if (userThrow == 1){
            if (compThrow == 1){    // rock vs rock
                win = null
            }
            if (compThrow == 2){    // rock vs scissors
                win = true
            }
            if (compThrow == 3){    // rock vs paper
                win = false
            }
        }
        else if (userThrow == 2){
            if (compThrow == 1){    // scissors vs rock
                win = false
            }
            if (compThrow == 2){    // scissors vs scissors
                win = null
            }
            if (compThrow == 3){    // scissors vs paper
                win = true
            }
        }
        else if (userThrow == 3){
            if (compThrow == 1){    // paper vs rock
                win = true
            }
            if (compThrow == 2){    // paper vs scissors
                win = false
            }
            if (compThrow == 3){    // paper vs paper
                win = null
            }
        }

        // inform user if they won, lost, or tied
        if (win == true){
            numWins = numWins + 1
            println("You won!")
        }
        else if (win == false){
            println("You lost!")
        }
        else{
            println("it's a tie!")
        }

        numGames = numGames + 1         // increment number of games

        // ask user if they want to play again
        var playAgain: Char = getCharInput("Would you like to play again (y/n)? ")

        // if user does not want to play again
        if (playAgain == 'n' || playAgain == 'N') {
            var winPercentage: Float = numWins  * 100f / numGames // calculate the win percentage
            println("\n\nYou won $numWins out of $numGames games ($winPercentage%)! \nQuitting...")
            play = false // ensures that the loop will end
        }
    }
}

