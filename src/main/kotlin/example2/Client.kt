package example2

fun main() {
    val receiver = Receiver()
    val invoker = TextEditorInvoker()

    // Setting up the receiver with initial text
    receiver.setText("Hello, Command Pattern!")

    // Creating commands
    val copyCommand = CopyCommand(receiver)
    val cutCommand = CutCommand(receiver)
    val pasteCommand = PasteCommand(receiver)

    // Executing commands
    invoker.executeCommand(copyCommand)
    invoker.executeCommand(cutCommand)
    invoker.executeCommand(pasteCommand)

    // Undoing the last command
    invoker.undoLastCommand()

    // Showing the final text
    receiver.showText()
}