package metanit.chap4.c13_delegate.c

interface Messenger {
    fun sendTextMessage()
    fun sendVideoMessage()
}
class InstantMessenger(val programName: String) : Messenger {
    override fun sendTextMessage() = println("Send text message")
    override fun sendVideoMessage() = println("Send video message")
}
class SmartPhone(val name: String, m: Messenger) : Messenger by  m {
    override fun sendTextMessage() = println("Send sms")
}

fun main() {
    val telegram = InstantMessenger("Telegram")
    val pixel = SmartPhone("Pixel 5", telegram)
    pixel.sendTextMessage()
    pixel.sendVideoMessage()
}