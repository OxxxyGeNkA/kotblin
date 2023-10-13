package metanit.chap4.c2_constr

fun main() {

    val tom = Person4("Tom")
    val bob = Person4("Bob", 41)
    val sam = Person4("Sam", 32, "JetBtains")

    println("Name: ${tom.name}  Age: ${tom.age}  Company: ${tom.company}")
    println("Name: ${bob.name}  Age: ${bob.age}  Company: ${bob.company}")
    println("Name: ${sam.name}  Age: ${sam.age}  Company: ${sam.company}")
}

class Person4(_name: String){
    val name = _name
    var age: Int = 0
    var company: String = "Undefined"

    constructor(_name: String, _age: Int) : this(_name){
        age = _age
    }

    constructor(_name: String, _age: Int, _comp: String) : this(_name, _age){
        company = _comp
    }
}