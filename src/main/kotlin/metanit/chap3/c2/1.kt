package metanit.chap3.c2

fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}
fun main() {

    printStrings("Tom", "Bob", "Sam")
    println()
    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
}