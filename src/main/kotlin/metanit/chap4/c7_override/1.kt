package metanit.chap4.c7_override.a

open class Person(val name: String, open var age: Int = 1) {
}

open class Employee(name: String): Person(name) {
    override var age: Int = 18
}

fun main() {
    val tom = Person("Tom")
    println("Name: ${tom.name}  Age: ${tom.age}")

    val bob = Employee("Bob")
    println("Name: ${bob.name}  Age: ${bob.age}")
}