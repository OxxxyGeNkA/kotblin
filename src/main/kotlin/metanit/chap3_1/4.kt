package metanit.chap3_1

fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}

fun main() {

    displayUser("Tom", 23, "Manager")
    displayUser("Alice", 21)
    displayUser("Kate")

    displayUser("Tom", position="Manager", age=28)
    displayUser(age=21, name="Alice")
    displayUser("Kate", position="Middle Developer")
}