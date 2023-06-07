fun main(){
    print("Введите имена")
    val names: String = readln()
    val arrayOfNames = names.split(",")
    arrayToMap(arrayOfNames)
}

fun arrayToMap(arrayOfNames: List<String>) {
    val map = mutableMapOf<Int,String>()
    var i = 0
    for(name: String in arrayOfNames){
        map[i] = name
        i++
    }
    println(map)
}
