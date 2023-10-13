package book.chap1

fun main() {
    println("First example:")
    var x = 1
    while (x < 10) {
        x = x + 1
        if (x > 3) {
            println("big x")
        }
    }

    println("\nSecond example:")
    x = 10
    while (x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }

    println("\nThird example:")
    x = 10
    while (x > 1) {
        x = x - 1
        print(if (x < 3) "small x " else "big x ")
    }
}