package visitor

class ListVisitor : Visitor() {
    private var currentDir = ""

    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        val saveDir = currentDir
        currentDir = "$currentDir/${directory.getName()}"
        directory.iterator().forEach {
            it.accept(this)
        }
        currentDir = saveDir
    }
}
