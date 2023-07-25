package example1

// Concrete Command for turning on the TV
class TurnOnTVCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.turnOn()
    }

    override fun undo() {
        tv.turnOff()
    }
}

// Concrete Command for turning on the stereo
class TurnOnStereoCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.turnOn()
    }

    override fun undo() {
        stereo.turnOff()
    }
}
