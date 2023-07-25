package example1

fun main() {
    val tv = TV()
    val stereo = Stereo()
    val remoteControl = RemoteControl()

    // Setting up the commands
    val turnOnTVCommand = TurnOnTVCommand(tv)
    val turnOnStereoCommand = TurnOnStereoCommand(stereo)

    // Using the remote control to turn on the TV
    remoteControl.setCommand(turnOnTVCommand)
    remoteControl.pressButton()

    // Using the remote control to turn on the stereo
    remoteControl.setCommand(turnOnStereoCommand)
    remoteControl.pressButton()

    // Using undo to turn off the stereo
    remoteControl.pressUndo()
}