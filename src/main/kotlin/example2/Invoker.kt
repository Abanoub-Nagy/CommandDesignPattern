package example2

// Invoker
class TextEditorInvoker {
    private val commandHistory = mutableListOf<Command>()

    fun executeCommand(command: Command) {
        command.execute()
        commandHistory.add(command)
    }

    fun undoLastCommand() {
        if (commandHistory.isNotEmpty()) {
            val lastCommand = commandHistory.removeAt(commandHistory.size - 1)
            lastCommand.undo()
        }
    }
}
