package interpreter

abstract class Node {
    abstract fun parse(context: Context)
}
