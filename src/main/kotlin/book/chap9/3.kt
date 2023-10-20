package book.chap9

fun main() {
    println("Set")
    val friendSet = setOf("Jim", "Sue", "Sue", "Nick", "Nick")
    val isFredGoing = friendSet.contains("Fred")
    for (item in friendSet) println(item)

    println("\nMutable Set")
    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    for (item in mFriendSet) println(item)

    mFriendSet.remove("Nick")
    println("\nDel Nick")
    for (item in mFriendSet) println(item)

    val toAdd = setOf("Joe", "Mia")
    mFriendSet.addAll(toAdd)
    println("\nAdd Joe and Mia")
    for (item in mFriendSet) println(item)

    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toList()
}