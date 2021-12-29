import java.io.File

fun main() {
    val file = File("kotlin_file_test.txt")
    file.createNewFile()
    file.writeText("Hello World!")
}