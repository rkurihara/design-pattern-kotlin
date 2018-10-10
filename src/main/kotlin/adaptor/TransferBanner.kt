package adaptor

open class TransferBanner(
    private val string: String
) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}
