package lab2

fun main() {
    var myArray = arrayOf(1, 2, 3)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"
    println(arraySize)
    println(firstItem)
    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
    println(result)
}