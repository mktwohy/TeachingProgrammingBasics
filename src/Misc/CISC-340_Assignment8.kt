package Misc/*
The first program is to request the user to enter a byte of data Misc.and then create the 12-bit Hamming code as described in
your text (see above).  The program is to then output this (with an appropriate label) in hex.
 */
// masks (if indexing from 1)
// 0123456789abc        indices
// 0001000000000        data (index 0)
// 0000011100000        data (index 1-3)
// 0000000001111        data (index 4-7)
// 0001011101111        data (index 0-7)
// 1110100010000        parity bits
// 0001010101010        parity 1
// 0001001100110        parity 2
// 0000011100001        parity 3
// 0000000001111        parity 4

val parMask     = listOf(1,1,0,1,0,0,0,1,0,0,0,0).toIntArray()
val parMask0    = listOf(0,1,1,1,1,1,1,1,1,1,1,1).toIntArray()
val parMask1    = listOf(0,0,1,0,1,0,1,0,1,0,1,0).toIntArray()
val parMask2    = listOf(0,0,1,0,0,1,1,0,0,1,1,0).toIntArray()
val parMask4    = listOf(0,0,0,0,1,1,1,0,0,0,0,1).toIntArray()
val parMask8    = listOf(0,0,0,0,0,0,0,0,1,1,1,1).toIntArray()

fun main() {
    val input = IntArray(8){ 1 }
    val hamCode = IntArray(12)
    createHammingCode(hamCode)


    println(input.contentToString())
    println(hamCode.contentToString())
}

infix fun IntArray.and(other: IntArray)
    = this.mapIndexed { i, _ -> this[i] and other[i] }.toIntArray()


fun calcParity(list: IntArray): Int{
    var numOnes = 0
    list.forEach{ if (it == 1) numOnes++ }
    return if (numOnes % 2 == 0) 1 else 0
}

fun createHammingCode(input: IntArray){
    val hamming = IntArray(12)

    // fill hamming with data bits
    var inputIndex = 0
    for(i in hamming.indices){
        if (parMask[i] == 0){
            hamming[i] = input[inputIndex]
            inputIndex ++
        }
    }

    hamming[0] = calcParity(hamming and parMask1)
    hamming[1] = calcParity(hamming and parMask2)
    hamming[3] = calcParity(hamming and parMask4)
    hamming[7] = calcParity(hamming and parMask8)
}
