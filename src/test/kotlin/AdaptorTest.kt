import adaptor.AbstractPrintBanner
import adaptor.TransferPrintBanner
import org.junit.Test

class AdaptorTest {

    @Test
    fun abstractAdaptor() {
        val p = AbstractPrintBanner("Hello")
        p.printWeak()
        p.printString()
    }

    @Test
    fun transferAdaptor() {
        val p = TransferPrintBanner("Hello")
        p.printWeak()
        p.printString()
    }
}
