package prototype.framework

interface Product {
    fun use(s: String)
    fun createClone(): Product
}
