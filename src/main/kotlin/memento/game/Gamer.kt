package memento.game

import java.util.Random

class Gamer(
    private var money: Int
) {

    private var fruits = arrayListOf<String>()
    private val random = Random()

    companion object {
        private val fruitName = arrayOf("りんご", "ぶどう", "バナナ", "みかん")
    }

    fun getMoney(): Int {
        return money
    }

    fun bet() {
        val dice = random.nextInt(6) + 1
        if (dice == 1) {
            money += 100
            println("所持金が増えました。")
        } else if (dice == 2) {
            money /= 2
            println("所持金が半分になりました。")
        } else if (dice == 6) {
            val f = getFruit()
            println("フルーツ $f をもらいました。")
            fruits.add(f)
        } else {
            println("何も起こりませんでした。")
        }
    }

    fun createMemento(): Memento {
        val m = Memento(money)
        fruits.forEach {
            if (it.startsWith("おいしい")) {
                m.addFruit(it)
            }
        }
        return m
    }

    fun restoreMemento(memento: Memento) {
        this.money = memento.money
        this.fruits = memento.getFruits()
    }


    override fun toString(): String {
        return "[money = $money , fruits = $fruits ]"
    }

    private fun getFruit(): String {
        val prefix = if (random.nextBoolean()) {
            "おいしい"
        } else {
            ""
        }
        return prefix + fruitName[random.nextInt(fruitName.size)]
    }


}
