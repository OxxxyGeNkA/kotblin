package book.chap8

class BadException : Exception()
fun myFunction(test: String) {
    try {
        print("t")
        riskyCode(test)
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
    }

    print("s")
}

fun riskyCode(test:String) {
    print("h")
    if (test == "Yes") {
        throw BadException()
    }
    print("r")
}

fun main() {
    myFunction("Yes")
    println()
    myFunction("No")
}