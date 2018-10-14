import abstractfactory.factory.Factory
import org.junit.Test

class AbstractFactoryTest {

    /*
        Abstract Factory
     */
    @Test
    fun abstractFactory() {
        val factory = Factory.getFactory("abstractfactory.factory.listfactory.ListFactory")

        val asahi = factory.createLink("朝日新聞", "http://www.asahi.com/")
        val yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/")

        val usYahoo = factory.createLink("Yahoo!", "http://www.yahooo.com/")
        val jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahooo.co.jp/")
        val excite = factory.createLink("Excite", "http://www.excite.com/")
        val google = factory.createLink("Google!", "http://www.google.com/")

        val trayNews = factory.createTray("新聞")
        trayNews.add(asahi)
        trayNews.add(yomiuri)

        val trayYahoo = factory.createTray("Yahoo!")
        trayYahoo.add(usYahoo)
        trayYahoo.add(jpYahoo)

        val traySearch = factory.createTray("サーチエンジン")
        traySearch.add(trayYahoo)
        traySearch.add(excite)
        traySearch.add(google)

        val page = factory.createPage("LinkPage", "結城 浩")
        page.add(trayNews)
        page.add(traySearch)
        page.output()
    }
}
