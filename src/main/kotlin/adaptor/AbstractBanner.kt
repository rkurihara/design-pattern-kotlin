package adaptor

open class AbstractBanner(
    private val string: String
) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}
