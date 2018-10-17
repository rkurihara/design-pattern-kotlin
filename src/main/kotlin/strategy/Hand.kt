package strategy

class Hand private constructor(
    private val handValue: Int
) {

    fun isStrongerThan(h: Hand) = fight(h) == 1


    fun isWeakerThan(h: Hand) = fight(h) == -1

    private fun fight(h: Hand) = if (this == h) {
        0
    } else if ((this.handValue + 1) % 3 == h.handValue) {
        1
    } else {
        -1
    }

    override fun toString(): String = name[handValue]


    companion object {
        const val HANDVALUE_GUU = 0
        const val HANDVALUE_CHO = 1
        const val HANDVALUE_PAA = 2

        val hand = arrayOf(Hand(HANDVALUE_GUU), Hand(HANDVALUE_CHO), Hand(HANDVALUE_PAA))
        private val name = arrayOf("グー", "チョキ", "パー")

        fun getHand(handValue: Int): Hand = hand[handValue]
    }

}
