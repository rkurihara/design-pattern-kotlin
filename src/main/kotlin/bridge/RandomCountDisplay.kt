package bridge

import java.util.Random

class RandomCountDisplay(
    impl: DisplayImpl
) : CountDisplay(impl) {
    fun randomDisplay(times: Int) {
        multiDisplay(Random().nextInt(times))
    }
}
