package metanit.chap4.c13_delegate.a

interface Messenger {
    fun send(message: String)
}
class InstantMessenger(val programName: String) : Messenger {
    override fun send(message: String) {
        println("Message `$message` has been sent")
    }
}
class SmartPhone(val name: String, m: Messenger): Messenger by  m

fun main() {
    val telegram = InstantMessenger("Telegram")
    val pixel = SmartPhone("Pixel 5", telegram)
    pixel.send("Hello Kotlin")
    pixel.send("Learn Kotlin on Metanit.com")
}