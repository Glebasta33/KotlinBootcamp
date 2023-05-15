fun main() {
    var i = 0
    while (i < 5) {
        val n = readln().toDouble()
        if (n < 0)
            continue
        println(sqrt(n))
        i++
    }