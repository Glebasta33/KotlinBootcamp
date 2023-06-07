import kotlin.random.Random
//
//fun main() {
//    val a: Array<String> = Array (5) {" "}
//    var i: Int = 0
//
//    while (i < a.size){
//        a[i] = readln()
//        i++
//    }
//    while(i > 0){
//        i--
//        println(a[i])
//    }
//}

fun main() {
    val a = Array (10) {0}
    var i = 0
    while (i < a.size){
        a[i] = Random.nextInt(15)
        print(a[i])
        print(" ")
        i++
    }
    println()
    println("Максимальное число:" + a.max())
    println("Минимальное число:" + a.min())
}