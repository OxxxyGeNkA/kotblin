package metanit.chap4.c10_insert_class.a

class Person {
    class Account(val username: String, val password: String) {

        fun showDetails() {
            println("UserName: $username  Password: $password")
        }
    }
}

fun main() {
    val userAcc = Person.Account("qwerty", "123456");
    userAcc.showDetails()
}