package factorymethod.idcard

import factorymethod.framework.Factory
import factorymethod.framework.Product

class IDCardFactory : Factory() {

    private val owners: MutableList<String> = mutableListOf()

    override fun createProduct(owner: String): Product {
        return IDCard(owner = owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).owner)
    }

    fun getOwners() = owners
}
