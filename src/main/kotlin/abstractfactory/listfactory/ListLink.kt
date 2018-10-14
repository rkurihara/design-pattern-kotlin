package abstractfactory.factory.listfactory

import abstractfactory.factory.Link

class ListLink(
    private val caption: String,
    private val url: String
) : Link(caption, url) {


    override fun makeHTML() = """  <li><a href="$url">$caption</a></li>"""
}
