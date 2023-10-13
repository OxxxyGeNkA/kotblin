package metanit.chap4.c2_constr

fun main() {

    val tom: Person3 = Person3("Tom")
    val bob: Person3 = Person3("Bob", 45)

    println("Name: ${tom.name}  Age: ${tom.age}")
    println("Name: ${bob.name}  Age: ${bob.age}")
}

class Person3(_name: String){
    val name: String = _name
    var age: Int = 0

    constructor(_name: String, _age: Int) : this(_name){
        age = _age
    }
}