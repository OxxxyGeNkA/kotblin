package metanit.chap3.c2

fun sum(vararg numbers: Int){
    var result=0
    for(n in numbers)
        result += n
    println("Сумма чисел равна $result")
}
fun main() {

    sum(1, 2, 3, 4, 5)
    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
}