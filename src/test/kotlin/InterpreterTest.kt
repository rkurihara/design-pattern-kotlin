import interpreter.Context
import interpreter.ProgramNode
import org.junit.Test
import java.io.BufferedReader
import java.io.FileReader

class InterpreterTest {

    @Test
    fun interpreter() {
        BufferedReader(
            FileReader(ClassLoader.getSystemResource("program.txt").path)
        ).use {
            it.forEachLine {
                println("text = $it")
                val node = ProgramNode()
                node.parse(Context(it))
                println("node = $node")
            }
        }
    }
}
