package interpreter

class RepeatCommandNode : Node() {

    private var number = 0
    private lateinit var commandListNode: Node

    override fun parse(context: Context) {
        context.skipToken("repeat")
        number = context.currentNumber()
        context.nextToken()
        commandListNode = CommandListNode()
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[repeat $number $commandListNode]"
    }
}
