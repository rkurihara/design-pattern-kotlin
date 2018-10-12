import factorymethod.framework.Factory
import factorymethod.framework.Product
import factorymethod.idcard.IDCardFactory
import org.junit.Test

class FactoryMethodTest {

    @Test
    fun factoryMethod() {
        val factory: Factory = IDCardFactory()
        val card1: Product = factory.create("結城浩")
        val card2: Product = factory.create("とむら")
        val card3: Product = factory.create("佐藤はなこ")
        card1.use()
        card2.use()
        card3.use()
    }

}
