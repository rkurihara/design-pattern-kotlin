package adaptor

class PrintBanner(
    string: String
) : Banner(string), Print {
    override fun printWeak() {
        showWithParen()
    }

    override fun printString() {
        showWithAster()
    }
}
