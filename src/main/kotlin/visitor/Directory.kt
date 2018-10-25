package visitor

class Directory(
    private val name: String
) : Entry() {

    private val dir = mutableListOf<Entry>()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        var size = 0
        dir.forEach {
            size += it.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry {
        dir.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> {
        return dir.iterator()
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}
