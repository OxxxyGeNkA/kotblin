package book.chap3

fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("Sum of 5 and 6")
    printSum(5, 6)

    println("\nSum of x = 7 and y = 8")
    val x: Int = 7
    val y: Int = 8
    printSum(x, y)

    println("\nMax of 2 and 5")
    println(max(2, 5))
}