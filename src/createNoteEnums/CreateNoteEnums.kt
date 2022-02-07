package createNoteEnums

import java.io.File

// spreadsheet from https://pages.mtu.edu/~suits/NoteFreqCalcs.html

data class NoteData(
    val freq: String,
    val next: String,
    val prev: String
)

fun File.splitByLine() =
    this.readText()
        .split('\n')
        .map { it.removeSuffix("\n") }

fun generateText(noteToNoteData: List<Pair<String, NoteData>>): String{
    val sb = StringBuilder()
    noteToNoteData.forEach{ (note, noteData) ->
        sb.append(
            note,
            " (",
            noteData.freq,
            ", ",
            noteData.next,
            ", ",
            noteData.prev,
            "),\n"
        )
    }
    return sb.toString()
}

fun String.formatNote() =
    if ('#' in this)
        this.replace("#", "s").substring(0..2)
    else
        "${this[0]}_${this[1]}".substring(0..2)

fun getPrevNote(notes: List<String>, i: Int) =
    if (i == 0) "null"
    else notes[i - 1]

fun getNextNote(notes: List<String>, i: Int) =
    if (i == notes.indices.last) "null"
    else notes[i + 1]

fun main() {
    val path = System.getProperty("user.dir") + "/src/createNoteEnums"
    val notes = File("$path/Notes.txt")
        .splitByLine()
        .map { it.formatNote() }
    val freqs = File("$path/Frequencies.txt")
        .splitByLine()
        .map { it.toDouble() }
        .map { it.toString() + 'f' }

    val noteToNoteData = notes.mapIndexed { i, note ->
        note to NoteData(
                freqs[i],
                getPrevNote(notes, i),
                getNextNote(notes, i)
            )
    }

    with(File("NoteEnums.txt")){
        writeText(generateText(noteToNoteData))
        createNewFile()
    }
}