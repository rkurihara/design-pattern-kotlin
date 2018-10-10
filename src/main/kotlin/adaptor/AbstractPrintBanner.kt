package adaptor

class AbstractPrintBanner(
    string: String
) : AbstractBanner(string), AbstractPrint {
    override fun printWeak() {
        showWithParen()
    }

    override fun printString() {
        showWithAster()
    }
}
