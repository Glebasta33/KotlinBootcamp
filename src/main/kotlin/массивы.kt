fun main() {
    val a: Array<String> = Array(5) {""}
    var i = 0
    while(i < a.size) {
        a[i] = readln()
        i++
    }
    a.reverse()
    i = 0
    while(i < a.size) {
        println(a[i])
        i++
    }
}