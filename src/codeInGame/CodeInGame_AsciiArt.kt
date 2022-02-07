class AsciiAlphabet(
    val letterWidth: Int,
    val letterHeight: Int,
    rows: List<String>
){
    private val allLetters = ('A'..'Z').toMutableList().apply{ add('?') }

    private val table = mutableMapOf<Char, MutableList<String>>()

    init {
        allLetters.forEach{
            table[it] = mutableListOf()
        }
        for (row in rows){
            allLetters.zip(row.chunked(letterWidth)).forEach { (char, string) ->
                table[char]?.add(string)
            }
        }
    }

    private fun Char.toLegalChar() =
        this.uppercaseChar().let {
            if (it in allLetters) it else '?'
        }

    operator fun get(char: Char, row: Int): String?
            = table[char.toLegalChar()]?.get(row)

    fun generateAsciiString(message: String): String {
        val sb = StringBuilder()
        for (rowIndex in 0 until letterHeight){
            for (char in message){
                sb.append(this[char, rowIndex] ?: "")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}