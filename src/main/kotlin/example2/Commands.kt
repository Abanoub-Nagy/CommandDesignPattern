package example2

// Concrete Command for copying text
class CopyCommand(private val receiver: Receiver) : Command {
    override fun execute() {
        receiver.copy()
    }

    override fun undo() {
        receiver.clearClipboard()
    }
}

// Concrete Command for cutting text
class CutCommand(private val receiver: Receiver) : Command {
    override fun execute() {
        receiver.cut()
    }

    override fun undo() {
        receiver.clearClipboard()
        receiver.undoCut()
    }
}

// Concrete Command for pasting text
class PasteCommand(private val receiver: Receiver) : Command {
    override fun execute() {
        receiver.paste()
    }

    override fun undo() {
        receiver.clearClipboard()
    }
}
