package facade.pagemaker

import java.io.Writer

class HtmlWriter(
    private val writer: Writer
) {

    fun title(title: String) {
        writer.write("<!DOCTYPE html>")
        writer.write("<html lang=\"ja\">")
        writer.write("<head>")
        writer.write("<meta charset=\"UTF-8\">")
        writer.write("<title>$title</title>")
        writer.write("</head>")
        writer.write("<body>\n")
        writer.write("<h1>$title</h1>\n")
    }

    fun paragraph(msg: String) {
        writer.write("<p>$msg</p>\n")
    }

    fun link(href: String, caption: String) {
        paragraph("<a href=\"$href\">$caption</a>")
    }

    fun mailto(mailaddr: String, username: String) {
        link("mailto:$mailaddr", username)
    }

    fun close() {
        writer.write("</body>")
        writer.write("</html>\n")
        writer.close()
    }

}
