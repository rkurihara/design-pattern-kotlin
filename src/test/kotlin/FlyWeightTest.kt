import flyweight.BigString
import org.junit.Test

class FlyWeightTest {

    @Test
    fun flyweight() {
        val bs = BigString("1212123")
        bs.print()
    }
}
