package metanit.chap4.c6_get_set.a

class Person(val name: String) {
    var age: Int = 1
        set(value) {
            if((value>0) and (value <110))
                field = value
        }
}

fun main() {
    val bob: Person = Person("Bob")
    bob.age = 25

    println(bob.age)
    bob.age = -8
    println(bob.age)
}
