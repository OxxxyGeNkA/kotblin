package metanit.chap4.c7_override.b

open class Person(val name: String) {
    open val fullInfo: String
        get() = "Person $name - $age"

    open var age: Int = 1
        set(value) {
            if(value > 0 && value < 110)
                field = value
        }
}
open class Employee(name: String): Person(name) {
    override val fullInfo: String
        get() = "Employee $name - $age"

    override var age: Int = 18
        set(value){
            if(value > 17 && value < 110)
                field = value
        }
}

fun main() {
    val tom = Person("Tom")
    tom.age = 14
    println(tom.fullInfo)

    val bob = Employee("Bob")
    bob.age = 14
    println(bob.fullInfo)
}