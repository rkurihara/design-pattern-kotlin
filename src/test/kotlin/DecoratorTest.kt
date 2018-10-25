import decorator.FullBorder
import decorator.SideBorder
import decorator.StringDisplay
import org.junit.Test

class DecoratorTest {

    @Test
    fun decorator() {
        val b1 = StringDisplay("Hello, world.")
        val b2 = SideBorder(b1, '#')
        val b3 = FullBorder(b2)
        b1.show()
        b2.show()
        b3.show()
        val b4 = SideBorder(
            FullBorder(
                FullBorder(
                    SideBorder(
                        FullBorder(
                            StringDisplay("Hello, world.")
                        )
                        , '*')
                )
            ),
            '/'
        )
        b4.show()
    }
}
