package metanit.chap4.c6_get_set.b

class Person(var firstname: String, var lastname: String) {
    val fullname: String
        get() = "$firstname $lastname"
}

fun main() {
    val tom = Person("Tom", "Smith")
    println(tom.fullname)
    tom.lastname = "Simpson"
    println(tom.fullname)
}
