package observer

class GraphObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver:")
        val count = generator.getNumber()
        for (i in 0 until count) {
            print("*")
        }
        println("")
        Thread.sleep(100)
    }
}
