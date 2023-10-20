package metanit.chap4.c14_anonime_class

fun main() {
    val tom = object {
        val name = "Tom"
        var age = 37
        fun sayHello(){
            println("Hi, my name is $name")
        }
    }
    println("Name: ${tom.name}  Age: ${tom.age}")
    tom.sayHello()
}