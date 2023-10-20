package metanit.chap4.c14_anonime_class.a

open class Person(val name: String) {
    open fun sayHello() {
        println("Hi, my name is $name")
    }
}

fun main() {
    val tom = object : Person("Tom") {
        val company = "JetBrains"
        override fun sayHello() {
            println("Hi, my name is $name. I work in $company")
        }
    }

    tom.sayHello()
}
