package interpreter

class ProgramNode : Node() {

    private lateinit var commandListNode: Node

    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode = CommandListNode()
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[program $commandListNode]"
    }

}
