//"*" - мимо, "#" - попал, "-" - пустая клетка, "&" - корабль, "+" - зона возле корабля

fun main() {
    val let = "abcdefghij"
    var a: Array<Array<String>> = Array(10, {Array(10, {"-"})})
    /*a[0][5] = "&"
    a[0][4] = "+"
    a[0][6] = "+"
    a[1][4] = "+"
    a[1][5] = "+"
    a[1][6] = "+"*/

    for (i in a) {
        for (j in i) {
            print("$j  ")
        }
        print(let[a.indexOf(i)])
        println()
    }
    println("1  2  3  4  5  6  7  8  9  10")
}