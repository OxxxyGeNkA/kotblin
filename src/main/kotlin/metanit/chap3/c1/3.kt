package metanit.chap3.c1

fun main() {

    displayUser("Tom", 23)
    displayUser("Alice", 19)
    displayUser("Kate", 25)
}
fun displayUser(name: String, age: Int){
    println("Name: $name   Age: $age")
}