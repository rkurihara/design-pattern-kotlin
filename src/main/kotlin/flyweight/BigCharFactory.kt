package flyweight

object BigCharFactory {
    private val pool = hashMapOf<String, BigChar>()

    @Synchronized
    fun getBigChar(charName: Char): BigChar {
        var bc = pool["" + charName]
        if (bc == null) {
            bc = BigChar(charName)
            pool["" + charName] = bc
        }
        return bc
    }
}
