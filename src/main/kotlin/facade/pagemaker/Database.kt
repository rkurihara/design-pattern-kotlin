package facade.pagemaker

import java.util.Properties

class Database private constructor() {

    companion object {
        fun getProperties(dname: String): Properties {
            val fileName = "$dname.txt"
            return Properties().also { prop ->
                ClassLoader.getSystemResourceAsStream(fileName).use {
                    prop.load(it)
                }
            }
        }
    }
}
