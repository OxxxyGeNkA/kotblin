package metanit.chap4.c2_constr

fun main() {

    val bob: Person2 = Person2("Bob", 23)

    println("Name: ${bob.name}  Age: ${bob.age}")
}

class Person2(val name: String, var age: Int){

}