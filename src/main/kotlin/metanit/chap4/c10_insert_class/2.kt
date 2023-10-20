package metanit.chap4.c10_insert_class.b

class Person(username: String, password: String) {

    private val account: Account = Account(username, password)

    private class Account(val username: String, val password: String)

    fun showAccountDetails() {
        println("UserName: ${account.username}  Password: $account.password")
    }
}
fun main() {
    val tom = Person("qwerty", "123456");
    tom.showAccountDetails()
}
