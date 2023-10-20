package book.chap9

fun main() {
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)

    val r3 = "Thai Curry"
    mRecipeMap.put("Recipe3", r3)
    for ((key, value) in mRecipeMap) {
        println("Key is $key, value is $value")
    }

    val r4 = "Jambalaya"
    val r5 = "Sausage Rolls"
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("\n")
    for ((key, value) in mRecipeMap) {
        println("Key is $key, value is $value")
    }

    mRecipeMap.remove("Recipe2")
    println("\n")
    for ((key, value) in mRecipeMap) {
        println("Key is $key, value is $value")
    }
}