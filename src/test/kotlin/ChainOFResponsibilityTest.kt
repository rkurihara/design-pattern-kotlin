import chainofresponsibility.LimitSupport
import chainofresponsibility.NoSupport
import chainofresponsibility.OddSupport
import chainofresponsibility.SpecialSupport
import chainofresponsibility.Trouble
import org.junit.Test

class ChainOFResponsibilityTest {

    @Test
    fun chainOfResponsibility() {
        val alice = NoSupport("Alice")
        val bob = LimitSupport("Bob", 100)
        val charile = SpecialSupport("Charile", 429)
        val diana = LimitSupport("Diana", 200)
        val elmo = OddSupport("Elmo")
        val fred = LimitSupport("Fred", 300)
        alice.setNext(bob).setNext(charile).setNext(diana).setNext(elmo).setNext(fred)
        for (i in 0 until 500 step 33) {
            alice.support(Trouble((i)))
        }
    }

}
