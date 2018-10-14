package builder

import java.io.FileWriter
import java.io.PrintWriter

class HTMLBuilder : Builder() {
    private var fileName: String = ""
    private lateinit var writer: PrintWriter


    override fun makeTitle(title: String) {
        fileName = "$title.html"
        writer = PrintWriter(FileWriter(fileName))
        writer.println("<!DOCTYPE html><html lang=\"ja\"><head><meta charset=\"UTF-8\"><title>$title</title></head><body>")
        writer.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun makeItems(item: Array<String>) {
        writer.println("<ul>")
        for (i in 0 until item.size) {
            writer.println("<li>${item[i]}</li>")
        }
        writer.println("</ul>")
    }

    override fun close() {
        writer.println("</body></html>")
        writer.close()
    }

    fun getResult(): String {
        return fileName
    }

}
