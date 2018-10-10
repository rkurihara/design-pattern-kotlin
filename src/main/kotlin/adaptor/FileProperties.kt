package adaptor

import java.io.File
import java.util.Properties

class FileProperties : FileIO {
    private val properties = Properties()

    override fun readFromFile(fileName: String) {
        File(fileName).inputStream().use {
            properties.load(it)
        }
    }

    override fun writeToFile(fileName: String) {
        File(fileName).outputStream().use {
            properties.store(it, "written by File Properties")
        }
    }

    override fun setValue(key: String, value: String) {
        properties.setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return properties.getProperty(key)
    }
}
