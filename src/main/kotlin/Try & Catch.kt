fun main() {
    val a = readln()
    val b = readln()
    var c: Int
    var flag: Boolean = true

    while(flag) {
        try {
            c = a.toInt() / b.toInt()
            println(c)
            flag = false
        } catch (e: NumberFormatException) {
            println("Надо вводить только числа")
        } catch (e: Exception) {
            println(e.toString())
        }
    }

}
