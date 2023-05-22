fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()
    when(c) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> println(a / b)
        else -> println("Ошибка")
    }
}