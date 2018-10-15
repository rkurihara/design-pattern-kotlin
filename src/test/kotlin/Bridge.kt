import bridge.CountDisplay
import bridge.Display
import bridge.RandomCountDisplay
import bridge.StringDisplayImpl
import org.junit.Test

class Bridge {

    @Test
    fun bridge() {
        val d1 = Display(StringDisplayImpl("Hello, Japan."))
        val d2 = CountDisplay(StringDisplayImpl("Hello, World."))
        val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))
        val d4 = RandomCountDisplay(StringDisplayImpl("Hello, Mars."))
        d1.display()
        d2.display()
        d3.display()
        d3.multiDisplay(5)
        d4.randomDisplay(5)
    }
}
