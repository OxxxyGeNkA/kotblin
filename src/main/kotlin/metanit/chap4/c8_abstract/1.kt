package metanit.chap4.c8_abstract

abstract class Human(val name: String) {
    fun hello() {
        println("My name is $name")
    }
}
class Person(name: String): Human(name)

fun main() {
    val kate: Person = Person("Kate")
    val slim: Human = Person("Slim Shady")
    kate.hello()
    slim.hello()
}