package interpreter

class CommandNode : Node() {

    private lateinit var node: Node

    override fun parse(context: Context) {
        if (context.currentToken() == "repeat") {
            node = RepeatCommandNode()
            node.parse(context)
        } else {
            node = PrimitiveCommandNode()
            node.parse(context)
        }
    }

    override fun toString(): String {
        return node.toString()
    }
}
