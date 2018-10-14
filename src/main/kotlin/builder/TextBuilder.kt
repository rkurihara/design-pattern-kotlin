package builder

class TextBuilder : Builder() {

    private val buffer = StringBuffer()

    override fun makeTitle(title: String) {
        buffer.append("==============================\n")
        buffer.append("【$title】\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■$str\n")
        buffer.append("\n")
    }

    override fun makeItems(item: Array<String>) {
        for (i in 0 until item.size) {
            buffer.append(" ・${item[i]}\n")
            buffer.append("\n")
        }
    }

    override fun close() {
        buffer.append("==============================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}
