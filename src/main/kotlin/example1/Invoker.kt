package example1

// Remote Control
class RemoteControl {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }

    fun pressUndo() {
        command?.undo()
    }
}