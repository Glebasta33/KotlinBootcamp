fun main() {
    var a = readln()
    var b: Int
    while(a != "stop") {
        b = readln().toInt()
        when (readln()) {
            "+" -> println(a.toInt() + b)
            "-" -> println(a.toInt() - b)
            "*" -> println(a.toInt() * b)
            "/" -> println(a.toInt() / b)
            else -> println("Ошибка")
        }
        a = readln()
    }
}
