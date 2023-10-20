package metanit.chap4.c4_inheritance.c

open class Person(val name: String) {
    fun printName() {
        println(name)
    }
}
class Employee(empName: String, val company: String): Person(empName) {
    fun printCompany() {
        println(company)
    }
}

fun main() {
    val bob = Employee("Bob", "JetBrains")
    bob.printName()
    bob.printCompany()
}
