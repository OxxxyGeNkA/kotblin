package metanit.chap4.c6_get_set.c

class Person(val name: String) {

    private var _age = 1
    var age: Int
        set(value) {
            if((value > 0) and (value < 110))
                _age = value
        }
        get()=  _age
}

fun main() {
    val tom = Person("Tom")
    println(tom.age)
    tom.age = 37
    println(tom.age)
    tom.age = 156
    println(tom.age)
}
