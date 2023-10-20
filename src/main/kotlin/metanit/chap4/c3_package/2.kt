package metanit.chap4.c3_package

import email.send
import email.Message

fun main() {
    val myMessage = Message("Hello Kotlin")
    send(myMessage, "tom@gmail.com")
}