package builder

abstract class Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(item: Array<String>)
    abstract fun close()
}
