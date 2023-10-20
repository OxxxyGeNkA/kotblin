package book.chap9

fun main() {
    println("List")
    val shopping: List<String>
    shopping = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        println(shopping.get(0))
    }

    for (item in shopping) println(item)

    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }

    println("\nMutable List")
    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    for (item in mShopping) println(item)

    mShopping.add(1, "Milk")
    println("\nAdd Milk on 1st pos")
    for (item in mShopping) println(item)

    if (mShopping.contains("Milk")) {
        mShopping.remove("Milk")
    }
    println("\nDel Milk")
    for (item in mShopping) println(item)

    if (mShopping.size > 1) {
        mShopping.removeAt(1)
    }
    println("\nDel 1st pos")
    for (item in mShopping) println(item)

    if (mShopping.size > 0) {
        mShopping.set(0, "Coffee")
    }
    println("\nSet 0 Coffee")
    for (item in mShopping) println(item)

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)
    println("\nAdd Cookies and Sugar")
    for (item in mShopping) println(item)

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    println("\nDel Milk and Sugar")
    for (item in mShopping) println(item)

    val toAddBack = listOf("Milk", "Sugar")
    mShopping.addAll(toAddBack)
    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)
    println("\nDel not Milk and Sugar")
    for (item in mShopping) println(item)

    mShopping.clear()
    println("\nClear")
    for (item in mShopping) println(item)
}