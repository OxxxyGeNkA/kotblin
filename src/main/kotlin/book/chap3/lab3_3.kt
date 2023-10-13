package book.chap3

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}

fun timesThree(x: Int): Int {
    val y = x * 3
    return y
}

fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}

fun main() {
    println("First example:")
    doSomething("smth", 5)

    println("\nSecond example:")
    println(timesThree(5))

    println("\nThird example:")
    val arr = arrayOf( 1, 5, 3, 6, 2, 2, 1)
    println(maxValue(arr))
}