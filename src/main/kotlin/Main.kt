fun main() {
    var a: Array<Array<String>> = Array(10, {Array(10, {"0"})})
    a[0][5] = "@"
    for (i in a) {
        for (j in i) {
            print("$j  ")
        }
        println()
    }
}