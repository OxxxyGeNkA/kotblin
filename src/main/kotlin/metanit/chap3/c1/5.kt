package metanit.chap3.c1

fun displayUser1(age: Int = 18, name: String){
    println("Name: $name   Age: $age")
}
fun main() {

    displayUser1(name="Tom", age=28)
    displayUser1(name="Kate")
}