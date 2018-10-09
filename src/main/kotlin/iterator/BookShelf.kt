package iterator

class BookShelf(
    maxSize: Int
) : Aggregate {
    private var last = 0
    private val books = arrayOfNulls<Book>(maxSize)

    fun getBookAt(index: Int) = books[index]

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength() = last

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}
