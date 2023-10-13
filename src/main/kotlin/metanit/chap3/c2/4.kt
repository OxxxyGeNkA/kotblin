package metanit.chap3.c2

fun printUserGroup2(group: String, vararg users: String, count:Int){
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}
fun main() {

    printUserGroup2("KT-091", "Tom", "Bob", "Alice", count=3)
}