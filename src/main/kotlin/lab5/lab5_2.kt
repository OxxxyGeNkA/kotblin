package lab5

open class Monster {
    open fun frighten(): Boolean {
        println("Aargh!")
        return true
    }
}
class Vampire : Monster() {
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return false
    }
}
class Dragon : Monster() {
    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }
}
fun main() {
    val m = arrayOf(Vampire(),
        Dragon(),
        Monster())
    for (item in m) {
        item.frighten()//
    }
}