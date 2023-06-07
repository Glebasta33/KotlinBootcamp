import kotlin.random.Random
fun main(){
    val a = Array (10){0}

    for (i in a.indices){
        a[i] = Random.nextInt(-10,10)
        print(" " + a[i])
    }
    println()

    for (i in a.indices){
        if (a[i] < 0){
            a[i] = 0
        }
        print(" " + a[i])
    }
}

fun maine() {
    val a = arrayOf("One", "Two", "Three",
        "Four", "Five", "Six", "Seven")
    for (i in a)
        if (i.contains('e'))
            println(i)
}
