package metanit.chap4.c14_anonime_class.b

fun hello(person: Person) {
    person.sayHello()
}
open class Person(val name: String) {
    open fun sayHello() = println("Hi, my name is $name")
}

fun main() {
    hello(
        object : Person("Sam") {
            val company = "JetBrains"
            override fun sayHello() {
                println("Hi, my name is $name. I work in $company")
            }
        })
}