package metanit.chap3_3

fun checkAge(age: Int){
    if(age < 0 || age > 110){
        println("Invalid age")
        return
    }
    println("Age is valid")
}
fun main() {

    checkAge(-10)
    checkAge(10)
}