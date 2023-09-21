package metanit.chap3_4

fun compareAge2(age1: Int, age2: Int){

    fun ageIsValid(age: Int)= age > 0 && age < 111

    if( !ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

fun main() {

    compareAge2(20, 23)
    compareAge2(-3, 20)
    compareAge2(34, 134)
    compareAge2(15, 8)
}