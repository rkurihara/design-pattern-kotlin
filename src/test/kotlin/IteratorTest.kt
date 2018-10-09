import iterator.Book
import iterator.BookShelf
import org.junit.Test

class IteratorTest {

    @Test
    fun iterator() {
        val bookShelf = BookShelf(9).also {
            it.appendBook(Book("Around The World in 80 Days"))
            it.appendBook(Book("Bible"))
            it.appendBook(Book("Cinderella"))
            it.appendBook(Book("Daddy-Long_Legs"))
        }
        val it = bookShelf.iterator()
        while (it.hasNext()) {
            val book = it.next() as Book
            println(book.name)
        }

    }
}


