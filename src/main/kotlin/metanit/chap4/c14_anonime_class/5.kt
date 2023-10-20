package metanit.chap4.c14_anonime_class.d

private inline fun createPerson(_name: String, _comp: String) = object: Person(_name) {
    val company = _comp
}

open class Person(val name: String)

fun main() {
    val tom = createPerson("Tom", "JetBrains")
    println(tom.name)
    //println(tom.company) //свойство недоступно
}