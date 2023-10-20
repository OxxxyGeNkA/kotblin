package book.chap9

fun main() {
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val r3 = "Thai Curry"

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }
}