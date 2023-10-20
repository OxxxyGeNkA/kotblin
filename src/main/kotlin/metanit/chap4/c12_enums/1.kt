package metanit.chap4.c12_enums.a

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main() {

    val day: Day = Day.FRIDAY
    println(day)
    println(Day.MONDAY)
}