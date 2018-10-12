import org.junit.Test
import singleton.Singleton

class SingletonTest {

    @Test
    fun singleton() {
        println("Start.")
        val obj1 = Singleton
        val obj2 = Singleton
        if (obj1 == obj2) println("obj1とobj2は同じインスタンスです") else println("obj1とobj2は違うインスタンスです")
        println("End.")
    }
}
