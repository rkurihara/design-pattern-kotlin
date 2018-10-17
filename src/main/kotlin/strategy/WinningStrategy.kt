package strategy

import java.util.Random

class WinningStrategy(
    seed: Long
) : Strategy {

    private val random = Random(seed)
    private var won = false
    private lateinit var prevHand: Hand

    override fun nextHand(): Hand {
        return if (!won) {
            Hand.getHand(random.nextInt(3))
                .also {
                    prevHand = it
                }
        } else {
            prevHand
        }
    }

    override fun study(win: Boolean) {
        won = win
    }
}
