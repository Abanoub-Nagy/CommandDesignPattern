package example2

// Receiver
class Receiver {
    private var clipboard: String = ""
    private var text: String = ""

    fun copy() {
        clipboard = text
        println("Text copied: $clipboard")
    }

    fun cut() {
        clipboard = text
        text = ""
        println("Text cut.")
    }

    fun paste() {
        text = clipboard
        println("Text pasted: $text")
    }

    fun clearClipboard() {
        clipboard = ""
    }

    fun undoCut() {
        text = clipboard
        clipboard = ""
        println("Undoing cut.")
    }

    fun setText(content: String) {
        text = content
        println("Text set: $text")
    }

    fun showText() {
        println("Current Text: $text")
    }
}
