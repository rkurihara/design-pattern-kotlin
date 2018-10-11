import org.junit.Test
import templatemethod.AbstractDisplay
import templatemethod.CharDisplay
import templatemethod.StringDisplay

class TemplateMethodTest {

    @Test
    fun templateMethod() {

        val d1: AbstractDisplay = CharDisplay('H')
        val d2: AbstractDisplay = StringDisplay("Hello, world.")
        val d3: AbstractDisplay = StringDisplay("こんにちは。")
        d1.display()
        d2.display()
        d3.display()
    }
}
