package metanit.chap4.c13_delegate

interface Messenger {
    val programName: String
}
class InstantMessenger(override val programName: String) : Messenger
class SmartPhone(val name: String, m: Messenger) : Messenger by  m {
    override val programName = "Default Messenger"
}

fun main() {
    val telegram = InstantMessenger("Telegram")
    val pixel = SmartPhone("Pixel 5", telegram)
    println(pixel.programName)
}
