package flyweight

import java.io.BufferedReader
import java.io.FileReader

class BigChar(
    charName: Char
) {

    private var fontData: String = ""

    init {
        BufferedReader(
            FileReader(ClassLoader.getSystemResource("big$charName.txt").path)
        ).use { reader ->
            val buf = StringBuffer()
            reader.forEachLine {
                buf.append(it)
                buf.append("\n")
            }
            this.fontData = buf.toString()
        }

    }

    fun print() {
        println(fontData)
    }
}
