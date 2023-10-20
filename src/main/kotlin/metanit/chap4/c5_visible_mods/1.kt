package metanit.chap4.c5_visible_mods.a

class Person(val name: String, val age: Int){
    public fun printPerson(){
        println("Name: $name  Age: $age")
    }
}

fun main() {
    val tom = Person("Tom", 37)
    tom.printPerson()

    println(tom.name)
    println(tom.age)
}