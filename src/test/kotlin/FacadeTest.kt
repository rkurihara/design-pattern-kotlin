import facade.pagemaker.PageMaker
import org.junit.Test

class FacadeTest {

    @Test
    fun facade() {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html")
    }
}
