import kotlin.random.Random
fun main() {
    val a = mutableListOf(1, 2, 3, 4, 5)
    println(a)
    a.shuffle()
    println(a)
    a.shuffle()
    println(a)

    val a2 = mutableListOf<Int>()

    for (i in 0..9) {
        a2.add(Random.nextInt(50))
    }
    println(a2)

    a2.sort()
    println(a2)

    a2.removeAt(9)
    a2.removeAt(0)
    println(a2)
}
