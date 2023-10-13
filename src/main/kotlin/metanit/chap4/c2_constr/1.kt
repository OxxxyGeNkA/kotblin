package metanit.chap4.c2_constr

fun main() {
    val tom = Person1("Tom")
    val bob = Person1("Bob")
    val alice = Person1("Alice")

    println(tom.name)   // Tom
    println(bob.name)   // Bob
    println(alice.name) // Alice
}

class Person1(_name: String){
    val name: String
    init{
        name = _name
    }
}