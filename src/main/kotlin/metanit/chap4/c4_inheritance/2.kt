package metanit.chap4.c4_inheritance.b

open class Person(val name: String) {
    fun printName() {
        println(name)
    }
}
class Employee(empName: String): Person(empName)

fun main() {
    val bob = Employee("Bob")
    bob.printName()
}
