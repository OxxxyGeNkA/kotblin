package metanit.chap3.c2

fun changeNumbers(vararg numbers: Int, koef: Int){
    for(number in numbers)
        println(number * koef)
}
fun main() {

    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef=2)
}