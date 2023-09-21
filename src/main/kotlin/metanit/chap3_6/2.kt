package metanit.chap3_6

fun main() {

    var operation: (Int, Int) -> Int = ::sum
    val result = operation(3, 5)
    println(result) // 8

    // operation указывает на функцию sum
    operation = ::sum
    val result1 = operation(14, 5)
    println(result1) // 19

    // operation указывает на функцию subtract
    operation = ::subtract
    val result2 = operation(14, 5)
    println(result2) // 9
}
fun sum(a: Int, b: Int): Int{
    return a + b
}

fun subtract(a: Int, b: Int): Int{
    return a - b
}