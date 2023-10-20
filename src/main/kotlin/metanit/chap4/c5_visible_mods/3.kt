package metanit.chap4.c5_visible_mods.c

fun main() {
    val tom = Employee("Tom", 37)
    tom.printEmployee()       // Name: Tom    Age: 37

    // println(tom.name)   // Ошибка! - свойство name - protected
    // tom.printPerson()  // Ошибка! - функция printPerson - protected
}
open class Person(protected val name:String, private val age: Int) {

    protected fun printPerson() {
        printName()
        printAge()
    }
    private fun printName() {
        println("Name: $name")
    }
    private fun printAge() {
        println("Age: $age")
    }
}
class Employee(name:String, age: Int) : Person(name, age) {

    fun printEmployee() {
        println("Employee $name. Full information:")
        printPerson()
        //printName() //printName - private
        //println("Age: $age") //age - private
    }
}