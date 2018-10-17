package composite

class Directory(
    private val name: String
) : Entry() {

    private val directory = mutableListOf<Entry>()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        var size = 0
        directory.forEach {
            size += it.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        directory.forEach {
            it.printList("$prefix/$name")
        }
    }
}
