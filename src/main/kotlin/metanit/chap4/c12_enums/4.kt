package metanit.chap4.c12_enums

enum class Operation {
    ADD, SUBTRACT, MULTIPLY
}
fun operate(n1: Int, n2: Int, op: Operation): Int {
    when(op) {
        Operation.ADD -> return n1 + n2
        Operation.SUBTRACT -> return n1 - n2
        Operation.MULTIPLY -> return n1 *n2
    }
}

fun main() {
    println(operate(5, 6, Operation.ADD))
    println(operate(5, 6, Operation.SUBTRACT))
    println(operate(5, 6, Operation.MULTIPLY))
}
