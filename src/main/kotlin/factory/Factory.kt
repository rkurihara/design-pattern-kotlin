package factory

abstract class Factory {
    companion object {
        @JvmStatic
        fun getFactory(className: String): Factory =
            Class.forName(className).newInstance() as Factory
    }

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}
