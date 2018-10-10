import adaptor.PrintBanner
import org.junit.Test

class AdaptorTest {

    @Test
    fun adaptor() {
        val p = PrintBanner("Hello")
        p.printWeak()
        p.printString()
    }
}
