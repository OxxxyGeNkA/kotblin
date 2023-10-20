package metanit.chap4.c7_override.c

open class Person(val name: String) {
    open fun display() {
        println("Name: $name")
    }
}
class Employee(name: String, val company: String): Person(name) {
    override fun display() {
        println("Name: $name    Company: $company")
    }
}

fun main() {
    val tom = Person("Tom")
    tom.display()

    val bob = Employee("Bob", "JetBrains")
    bob.display()
}