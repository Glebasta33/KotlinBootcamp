fun main() {
    val a: Array<Int> = arrayOf(1, 30, 15, 35,24)
    val i: Int = 0
    srednee(a)
}
fun srednee(a:Array<Int>){
    val sum = a.sum()
    val size = a.size
    val sred = sum / size
    println(sred)
}