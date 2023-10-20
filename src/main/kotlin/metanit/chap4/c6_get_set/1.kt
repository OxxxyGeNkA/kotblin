package metanit.chap4.c6_get_set

var age: Int = 18
    set(value) {
        println("Call setter")
        if((value>0) and (value <110))
            field = value
    }
    get() {
        println("Call getter")
        return field
    }

fun main() {
    println(age)
    age = 45
    println(age)
    age = -345
    println(age)
}