package chainofresponsibility

class Trouble(
    private val number: Int
) {
    fun getNumber(): Int = number

    override fun toString(): String {
        return "[Trouble $number ]"
    }
}
