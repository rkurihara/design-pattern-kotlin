package prototype

import prototype.framework.Product

class UnderlinePen(
    private val ulchar: Char
) : Product, Cloneable {
    override fun use(s: String) {
        val length = s.toByteArray().size
        println(""""$s"""")
        print(" ")
        for (i in 0 until length) {
            print(ulchar)
        }
        println("")
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}
