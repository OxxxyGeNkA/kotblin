package metanit.chap4.c14_anonime_class.c

private fun createPerson(_name: String, _company: String) = object {
    val name = _name
    val company = _company
    fun sayHello() = println("Hi, my name is $name. I work in $company")
}

fun main() {
    val tom = createPerson("Tom", "JetBrains")
    tom.sayHello()
}