import adaptor.AbstractPrintBanner
import org.junit.Test

class AdaptorTest {

    @Test
    fun adaptor() {
        val p = AbstractPrintBanner("Hello")
        p.printWeak()
        p.printString()
    }
}
