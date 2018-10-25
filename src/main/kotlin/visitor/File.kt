package visitor

class File(
    private val name: String,
    private val size: Int
) : Entry() {
    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return size
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}
