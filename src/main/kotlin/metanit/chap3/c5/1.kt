package metanit.chap3.c5

fun sum(a: Int, b: Int) : Int{
    return a + b
}
fun sum(a: Double, b: Double) : Double{
    return a + b
}
fun sum(a: Int, b: Int, c: Int) : Int{
    return a + b + c
}
fun sum(a: Int, b: Double) : Double{
    return a + b
}
fun sum(a: Double, b: Int) : Double{
    return a + b
}

fun main() {

    val a = sum(1, 2)
    val b = sum(1.5, 2.5)
    val c = sum(1, 2, 3)
    val d = sum(2, 1.5)
    val e = sum(1.5, 2)
}