import kotlin.random.Random

fun main() {
    while (true) {
        when (readln()) {
            "Maps" -> startMap()
            "Collections" -> startCollections()
            else -> println("Command not found")
        }
    }
}

fun startMap() {
    val map = mutableMapOf<String, Int>()

    for (i in 0..3){
        val name = readln()
        val age = readln().toInt()
        map[name] = age
    }
    while (true) {
        println("Введите ключ")
        val input = readln()
        if (input == "stop") break
        println(map[input])
    }
}

fun startCollections() {
    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..9){
        listOfNumbers.add(Random.nextInt(50))
    }
    println(listOfNumbers)
    listOfNumbers.sort()
    println(listOfNumbers)

    listOfNumbers.removeAt(9)
    listOfNumbers.removeAt(0)
    println(listOfNumbers)
}
