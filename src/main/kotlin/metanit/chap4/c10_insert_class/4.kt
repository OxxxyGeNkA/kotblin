package metanit.chap4.c10_insert_class

class A {
    private val n: Int = 1
    inner class B {
        private val n: Int = 1
        fun action() {
            println(n)        //B
            println(this.n)   //B
            println(this@B.n) //B
            println(this@A.n) //A
        }
    }
}