package metanit.chap4.c1_classes

fun main() {

    val bob: Person = Person()
    println(bob.name)
    println(bob.age)

    bob.name = "Bob"
    bob.age = 25

    println(bob.name)
    println(bob.age)

    val tom = Person()
    tom.name = "Tom"
    tom.age = 37

    tom.sayHello()
    tom.go("the shop")
    println(tom.personToString())

}

class Person{
    var name: String = "Undefined"
    var age: Int = 18

    fun sayHello(){
        println("Hello, my name is $name")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun personToString() : String{
        return "Name: $name  Age: $age"
    }
}