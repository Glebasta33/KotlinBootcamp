import kotlin.random.Random
fun main() {
    val a = Random.nextInt(-5, 6)
    if (a > 0)
        println(1)
    else
        if (a < 0)
            println(-1)
        else
            println(0)
}

fun main() {
    val num = Random.nextInt(32, 123)
    val ch = num.toChar()
    println(ch)
    when {
        ch.isDigit() -> println("Это цифра")
        ch.isLetter() -> println("Это буква")
        else -> println("Это не буква и не цифра")
    }
}