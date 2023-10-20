package metanit.chap4.c4_inheritance.a

open class Person {
    var name: String = "Undefined"
    fun printName() {
        println(name)
    }
}
class Employee: Person {

    constructor() : super() {

    }
}

fun main() {
    val bob: Employee = Employee()
    bob.name = "Bob"
    bob.printName()
}