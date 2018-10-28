package memento.game

class Memento(
    val money: Int
) {
    private val fruits = arrayListOf<String>()

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }

    fun getFruits(): ArrayList<String> {
        return fruits.clone() as ArrayList<String>
    }
}
