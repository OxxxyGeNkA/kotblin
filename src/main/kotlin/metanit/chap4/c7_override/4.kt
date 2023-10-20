package metanit.chap4.c7_override.d

open class Person(val name: String) {
    open fun display() {
        println("Name: $name")
    }
}
open class Employee(name: String, val company: String): Person(name) {
    override fun display() {
        println("Name: $name    Company: $company")
    }
}
class Manager(name: String, company: String):Employee(name, company) {
    override fun display() {
        println("Name: $name Company: $company  Position: Manager")
    }
}