package metanit.chap3.c2

fun printUserGroup(count:Int, vararg users: String){
    println("Count: $count")
    for(user in users)
        println(user)
}

fun main() {

    printUserGroup(3, "Tom", "Bob", "Alice")
}