package lab1

fun main() {
    println("First example:")
    var x = 0
    var y = 0
    while (x < 5) {
        y = x - y
        print("$x$y ")
        x = x + 1
    }

    println("\n\nSecond example:")
    x = 0
    y = 0
    while (x < 5) {
        y = y + x
        print("$x$y ")
        x = x + 1
    }

    println("\n\nThird example:")
    x = 0
    y = 0
    while (x < 5) {
        y = y + 3
        if (y > 4) y = y - 1
        print("$x$y ")
        x = x + 1
    }

    println("\n\nFourth example:")
    x = 0
    y = 0
    while (x < 5) {
        x = x + 2
        y = y + x
        print("$x$y ")
        x = x + 1
    }

    println("\n\nFifth example:")
    x = 0
    y = 0
    while (x < 5) {
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3
        print("$x$y ")
        x = x + 1
    }
}
