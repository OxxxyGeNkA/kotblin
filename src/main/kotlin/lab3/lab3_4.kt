package lab3

fun main() {
    println("First example:")
    var x = 0
    var y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            x += 6
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    println("\nSecond example:")
    x = 0
    y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            x--
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    println("\nThird example:")
    x = 0
    y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            y = x + y
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    println("\nFourth example:")
    x = 0
    y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            y = 7
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    println("\nFifth example:")
    x = 0
    y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            x = x + y
            y = x - 7
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

    println("\nSixth example:")
    x = 0
    y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            x = y
            y++
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")
}