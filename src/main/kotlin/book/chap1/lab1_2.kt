package book.chap1

fun main() {
    var x = 3
    val name = "Cormoran"
    x *= 10
    print("x is $x.")

    while (x > 20) {
        x -= 1
        print(" x is now $x.")
    }
    for (i in 1..10) {
        x += 1
        print(" x is now $x.")
    }

    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }
    if (name.equals("Cormoran")) {
        println("$name Strike")
    }
}