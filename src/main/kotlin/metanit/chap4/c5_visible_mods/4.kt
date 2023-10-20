package metanit.chap4.c5_visible_mods.d

fun main() {
    val tom = Employee("Tom", 37)
    tom.printPerson()
}
open class Person private constructor(val name:String) {
    var age: Int = 0
    protected constructor(_name:String, _age: Int): this(_name){    // вызываем приватный конструктор
        age = _age
    }
    fun printPerson(){
        println("Name: $name Age: $age")
    }
}
class Employee(name:String, age: Int) : Person(name, age)

