package metanit.chap4.c3_package

import email.*

fun main() {
    val myMessage = Message("Hello Kotlin")
    send(myMessage, "tom@gmail.com")
}