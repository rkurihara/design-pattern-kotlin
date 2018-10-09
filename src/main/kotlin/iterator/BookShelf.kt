package iterator

class BookShelf : Aggregate {
    private val books = mutableListOf<Book>()

    fun getBookAt(index: Int) = books[index]

    fun appendBook(book: Book) {
        this.books.add(book)
    }

    fun getLength() = books.size

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}
