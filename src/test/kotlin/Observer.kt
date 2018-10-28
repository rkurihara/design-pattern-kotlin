import observer.DigitObserver
import observer.GraphObserver
import observer.RandomNumberGenerator
import org.junit.Test

class Observer {

    @Test
    fun observer() {
        val generator = RandomNumberGenerator()
        val observer1 = DigitObserver()
        val observer2 = GraphObserver()
        generator.addObserver(observer1)
        generator.addObserver(observer2)
        generator.execute()
    }
}
