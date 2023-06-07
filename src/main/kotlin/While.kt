
fun main(){
    print("введите число a:")
    var a = readln()
    var b: Int

    while(a != "stop"){
        print("введите число b:")
        b = readln().toInt()
        println("введите оператор:")
        when (readln()){
            "+" -> println(a.toInt()+b)
            "-" -> println(a.toInt()-b)
        }
        a = readln()
    }
}