package prototype

import prototype.framework.Product

class MessageBox(
    private val decochar: Char
) : Product, Cloneable {
    override fun use(s: String) {
        val length = s.toByteArray().size
        for (i in 0 until length + 4) {
            print(decochar)
        }
        println("")
        println("$decochar $s $decochar")
        for (i in 0 until length + 4) {
            print(decochar)
        }
        println("")
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}
