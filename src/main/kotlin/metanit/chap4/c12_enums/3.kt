package metanit.chap4.c12_enums

interface Printable {
    fun printName()
}

enum class DayTime: Printable {
    DAY {
        override val startHour = 6
        override val endHour = 21
        override fun printName() {
            println("День")
        }
    },
    NIGHT {
        override val startHour = 22
        override val endHour = 5
        override fun printName() {
            println("Ночь")
        }
    };
    abstract val startHour: Int
    abstract val endHour: Int
}

fun main() {
    DayTime.DAY.printName()
    DayTime.NIGHT.printName()

    println("Day from ${DayTime.DAY.startHour} to ${DayTime.DAY.endHour}")

}