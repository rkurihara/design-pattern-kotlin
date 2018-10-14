import builder.Director
import builder.HTMLBuilder
import builder.TextBuilder
import org.junit.Test

class Builder {

    @Test
    fun textBuilder() {
        val textBuilder = TextBuilder()
        val director = Director(textBuilder)
        director.construct()
        val result = textBuilder.getResult()
        println(result)
    }

    @Test
    fun htmlBuilder() {
        val htmlBuilder = HTMLBuilder()
        val director = Director(htmlBuilder)
        director.construct()
        val result = htmlBuilder.getResult()
        println("${result}が作成されました。")
    }
}
