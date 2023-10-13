package metanit.chap3.c1

fun double(numbers: IntArray){
    numbers[0] = numbers[0] * 2
    println("Значение в функции double: ${numbers[0]}")
}

fun main() {

    var nums = intArrayOf(4, 5, 6)
    double(nums)
    println("Значение в функции main: ${nums[0]}")
}