fun main(){
    while(true) {
        print("Введите первое число: ")
        var a = readln().toInt()
        print("Введите второе число: ")
        var b = readln().toDouble()
        print("Введите действие: ")
        calculate(a, b)
    }
}

fun calculate(aa: Int, bb: Double){
    when(readln()){
        "+" -> println("Ответ ${aa+bb}")
        "-" -> println("Ответ ${aa-bb}")
        "/" -> println("Ответ ${aa/bb}")
        "*" -> println("Ответ ${aa*bb}")
        else -> println("Ошибка")
    }
}