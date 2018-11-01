package command.command

import java.util.Stack

class MacroCommand : Command {

    private val commands: Stack<Command> = Stack()

    override fun execute() {
        commands.forEach { it.execute() }
    }

    fun append(cmd: Command) {
        if (cmd != this) {
            commands.push(this)
        }
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            commands.pop()
        }
    }

    fun clear() {
        commands.clear()
    }

}
