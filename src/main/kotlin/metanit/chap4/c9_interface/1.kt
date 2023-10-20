package metanit.chap4.c9_interface

interface Movable {
    var speed: Int
    fun move()
    fun stop() {
        println("Остановка")
    }
}

interface Info {
    val model: String
        get() = "Undefined"
    val number: String
}

class Car(override val model: String, override var number: String) : Movable, Info{
    override var speed = 60
    override fun move() {
        println("Машина едет со скоростью $speed км/ч")
    }
}
class Aircraft : Movable {
    override var speed = 600
    override fun move() {
        println("Самолет летит со скоростью $speed км/ч")
    }
    override fun stop() {
        println("Приземление")
    }
}

fun main() {
    val tesla: Car = Car("Tesla", "2345SDG")
    println(tesla.model)
    println(tesla.number)
    tesla.move()
    tesla.stop()

    val m2: Movable = Aircraft()
    m2.move()
    m2.stop()
}