package metanit.chap3_6

fun main() {

    val message: () -> Unit
    message = ::hello
    message()
}

fun hello(){
    println("Hello Kotlin")
}