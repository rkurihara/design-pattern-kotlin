package abstractfactory.factory.listfactory

import abstractfactory.factory.Page

class ListPage(
    private val title: String,
    private val author: String
) : Page(title, author) {
    override fun makeHTML(): String {
        return """
            |<!DOCTYPE html>
            |<html lang="ja"><head><meta charset="UTF-8"><title>$title</title></head>
            |<body>
            |<h1>$title</h1>
            |<ul>
            |${content.joinToString(separator = "") { it.makeHTML() }}
            |</ul>
            |<hr><address>$author</address>
            |</body></html>
        """.trimMargin()
    }
}
