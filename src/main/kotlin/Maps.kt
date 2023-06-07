fun main() {
    val map = mutableMapOf<String, Int>()

    for (i in 0..3){
        val name = readln()
        val age = readln().toInt()
        map[name] = age
    }
    while (true) {
        println("Введите ключ")
        val input = readln()
        println(map[input])
    }

}