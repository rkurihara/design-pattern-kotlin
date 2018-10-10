import adaptor.AbstractPrintBanner
import adaptor.FileProperties
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

    @Test
    fun exercise2_2() {
        val f = FileProperties()
        f.readFromFile("file.txt")
        f.setValue("year", "2004")
        f.setValue("month", "4")
        f.setValue("day", "21")
        f.writeToFile("newfile.txt")
    }
}
