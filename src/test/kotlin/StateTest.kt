import org.junit.Test
import state.SafeFrame

class StateTest {

    @Test
    fun state() {
        val frame = SafeFrame("State Sample")
        while (true) {
            for (hour in 0 until 24) {
                frame.setClock(hour)
                Thread.sleep(1000)
            }
        }
    }
}
