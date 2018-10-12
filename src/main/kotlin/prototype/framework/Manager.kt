package prototype.framework

class Manager {
    private val showCase = hashMapOf<String, Product>()

    fun register(name: String, proto: Product) {
        showCase[name] = proto
    }

    fun create(protoName: String): Product {
        val p: Product = showCase[protoName]!!
        return p.createClone()
    }
}
