package createNoteEnums

import java.io.File

// note to [freq, prev, next]
val noteToAttributes = mutableMapOf<String, List<String>>()

data class LineData(
    val note: String,
    val freq: String,
    val waveLength: String,
)

fun getLineData(line: String): LineData{
    var (note, freq, waveLength) = line
        .removePrefix(" ")
        .removeSuffix("\n")
        .split(' ')
    note = note.split("/").first()  // only want sharp, not flat
    return LineData(note, freq, waveLength)
}


fun initMap(){
    val dataSrc = File("dataSource.txt").readText()
    val lines = dataSrc.split('\n')
    val lineData = lines.map { getLineData(it) }
    lineData.forEachIndexed{ i, cur ->
        val prev = if (i == 0) null else lineData[i - 1]
        val next = if (i == lineData.indices.last) null else lineData[i + 1]

        val freq = cur.freq
        val prevNote = prev?.note ?: "null"
        val nextNote = next?.note ?: "null"
        noteToAttributes[cur.note] = listOf(freq, prevNote, nextNote)
    }
}

fun writeMapToFile(){

}

