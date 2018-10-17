package composite

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }

    fun printList() {
        printList("")
    }

    internal abstract fun printList(prefix: String)

    override fun toString() = "${getName()} (${getSize()})"
}
