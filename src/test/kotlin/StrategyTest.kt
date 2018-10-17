import org.junit.Test
import strategy.Player
import strategy.ProbStrategy
import strategy.WinningStrategy

class StrategyTest {

    @Test
    fun strategy() {
        val seed1 = 314L
        val seed2 = 15L
        val player1 = Player("Taro", WinningStrategy(seed1))
        val player2 = Player("Hana", ProbStrategy(seed2))
        for (i in 0 until 10000) {
            val nextHand1 = player1.nextHand()
            val nextHand2 = player2.nextHand()
            if (nextHand1.isStrongerThan(nextHand2)) {
                println("Winner: $player1")
                player1.win()
                player2.lose()
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                println("Winner: $player2")
                player1.lose()
                player2.win()
            } else {
                println("Even...")
                player1.even()
                player2.even()
            }
        }
        println("Total result:")
        println(player1.toString())
        println(player2.toString())
    }
}
