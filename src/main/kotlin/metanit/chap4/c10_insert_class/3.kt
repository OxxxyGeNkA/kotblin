package metanit.chap4.c10_insert_class

class BankAccount(private var sum: Int) {
    fun display() {
        println("sum = $sum")
    }

    inner class Transaction(private var sum: Int){
        fun pay(){
            this@BankAccount.sum -= this@Transaction.sum
            display()
        }
    }
}

fun main() {
    val acc = BankAccount(3400);
    acc.Transaction(2400).pay()
}
