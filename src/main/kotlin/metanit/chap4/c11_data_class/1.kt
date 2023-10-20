package metanit.chap4.c11_data_class

data class Person(var name: String, var age: Int)

fun main() {
    val alice: Person = Person("Alice", 24)
    val kate = alice.copy(name = "Kate")
    println(alice.toString())
    println(kate.toString())

    val (username, userage) = alice
    println("Name: $username  Age: $userage")
}
