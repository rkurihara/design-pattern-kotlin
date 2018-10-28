import memento.game.Gamer
import org.junit.Test

class MementoTest {

    @Test
    fun memento() {
        val gamer = Gamer(100)
        var memento = gamer.createMemento()
        for (i in 0 until 100) {
            println("==== $i")
            println("現状: $gamer")

            gamer.bet()

            println("所持金は ${gamer.getMoney()} 円になりました。")

            if (gamer.getMoney() > memento.money) {
                println("(だいぶ増えたので、現在の状態を保存しておこう。)")
                memento = gamer.createMemento()
            } else if (gamer.getMoney() < memento.money / 2) {
                println("(だいぶ減ったので、以前の状態に復帰しよう。)")
                gamer.restoreMemento(memento)
            }

            Thread.sleep(1000)
            println("")
        }
    }
}
