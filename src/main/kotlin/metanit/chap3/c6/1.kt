package metanit.chap3.c6

fun main() {

    val message: () -> Unit
    message = ::hello
    message()
}

fun hello(){
    println("Hello Kotlin")
}