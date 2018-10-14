package abstractfactory.factory

import java.io.FileWriter

abstract class Page(
    title: String,
    author: String
) {
    private val title = title
    protected val content = mutableListOf<Item>()

    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        val fileName = "$title.html"
        FileWriter(fileName).use {
            it.write(this.makeHTML())
        }
        println("${fileName}を作成しました")
    }

    abstract fun makeHTML(): String
}
