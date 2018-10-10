package adaptor

class TransferPrintBanner(
    string: String
) : TransferPrint() {
    private val banner = TransferBanner(string)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printString() {
        banner.showWithAster()
    }
}
