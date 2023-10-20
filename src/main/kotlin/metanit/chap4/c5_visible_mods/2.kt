package metanit.chap4.c5_visible_mods.b

class Person(private val name:String, _age: Int) {
    private val age = _age

    fun printPerson() {
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

fun main() {
    val tom = Person("Tom", 37)
    tom.printPerson()

    //println(tom.name) //свойство name - private
    //tom.printAge() //функция printAge - private
}