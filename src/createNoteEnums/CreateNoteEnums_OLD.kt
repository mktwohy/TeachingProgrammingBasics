package createNoteEnums
//
//import java.io.File
//import java.lang.StringBuilder
//import java.net.HttpURLConnection
//import java.net.URL
//
//data class LineData(
//    val note: String,
//    val freq: String,
//    val waveLength: String,
//)
//
//data class NoteData(
//    val freq: String,
//    val next: String,
//    val prev: String
//)
//
//val path = System.getProperty("user.dir") + "/src/createNoteEnums/dataSource.txt"
//val dataSrc = File(path)
//    .readText()
//    .replace(" ", "")
////    .replace('\t',' ')
//    .split('\n')
////    .map { it.toLineData() }
//
////
////val noteToNoteData = mutableMapOf<String, NoteData>().apply {
////    dataSrc.forEachIndexed{ i, cur ->
////        val prev = if (i == 0) null else dataSrc[i - 1]
////        val next = if (i == dataSrc.indices.last) null else dataSrc[i + 1]
////        this[cur.note] = cur.toNoteData(prev, next)
////    }
////}
////
////fun String.isolateSharpNote() = this.split("/").first()
////
////fun String.toLineData(): LineData{
////    var (note, freq, waveLength) = this.split('\t').also { println(it.size) }
////    note = note.isolateSharpNote()
////    return LineData(note, freq, waveLength)
////}
////
////fun LineData.toNoteData(prev: LineData?, next: LineData?) =
////    NoteData(
////        this.freq,
////        prev?.note ?: "null",
////        next?.note ?: "null"
////    )
////
////
////fun generateText(): String{
////    val sb = StringBuilder()
////    noteToNoteData.forEach{ (note, noteData) ->
////        sb.append(
////            note,
////            " (",
////            noteData.freq,
////            ", ",
////            noteData.next,
////            ", ",
////            noteData.prev,
////            ")\n"
////        )
////    }
////    return sb.toString()
////}
//
//fun Misc.main() {
//    val url = URL("https://pages.mtu.edu/~suits/notefreqs.html")
//    val urlConnection = url.openConnection() as HttpURLConnection
//
//    try {
//        val text = urlConnection.inputStream.bufferedReader().readText()
//        println(text)
//    } finally {
//        urlConnection.disconnect()
//    }
//
//    println(dataSrc)
////    println(dataSrc.size)
////    println(noteToNoteData.size)
////
////    with(File("NoteEnums.txt")){
////        writeText(generateText())
////        createNewFile()
////    }
//}
