package metanit.chap4.c7_override.f

open class Person(val name: String) {
    open val fullInfo: String
        get() = "Name: $name"

    open fun display() {
        println("Name: $name")
    }
}
open class Employee(name: String, val company: String): Person(name) {
    override val fullInfo: String
        get() = "${super.fullInfo} Company: $company"

    final override fun display() {
        super.display()
        println("Company: $company")
    }
}
