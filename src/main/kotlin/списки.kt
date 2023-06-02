fun main() {
    val a = mutableListOf(1, 2, 3, 4, 5)
    println(a)
    a.shuffle()
    println(a)
    a.shuffle()
    println(a)
}

import kotlin.random.Random
fun main() {
    val a = mutableListOf<Int>()

    for (i in 0..9) {
        a.add(Random.nextInt(50))
    }
    println(a)

    a.sort()
    println(a)

    a.removeAt(9)
    a.removeAt(0)
    println(a)
}