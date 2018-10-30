package flyweight

class BigString(
    string: String
) {

    private val bigchars: Array<BigChar?> = arrayOfNulls(string.length)

    init {
        val factory = BigCharFactory
        string.forEachIndexed { index, c ->
            bigchars[index] = factory.getBigChar(c)
        }
    }

    fun print() {
        for (i in 0 until bigchars.size) {
            bigchars[i]!!.print()
        }
    }

}
