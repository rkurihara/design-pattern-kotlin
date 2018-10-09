package listfactory

import factory.Tray

class ListTray(
    private val caption: String
) : Tray(caption) {
    override fun makeHTML(): String {
        return """
            |<li>
            |$caption
            |<ul>
            |${tray.joinToString(separator = "\n") { it.makeHTML() }}
            |</ul>
            |</li>
            """.trimMargin()
    }
}
