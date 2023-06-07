fun main() {
    println("Введите имена через запятую:")
    val names: String = readln().orEmpty()
    val namesArray = names.split(",")

    println("Введите зарплаты через запятую:")
    val salaries = readln().orEmpty()
    val salariesArray = salaries.split(",")

    validateArrays(namesArray, 10, "Name")
    validateArrays(salariesArray, 6, "Salary")

    printTable(namesArray, salariesArray)
}

fun validateArrays(namesArray: List<String>, maxSize: Int, entity: String) {
    for (name in namesArray) {
        if (name.length > maxSize) println("$entity должно быть в пределах $maxSize")
        break;
    }
}

fun printTable(namesArray: List<String>, salariesArray: List<String>) {
    println("-".repeat(23))

    for(name in namesArray){
        val index = namesArray.indexOf(name)
        val salary = salariesArray[index]
        val f1 = (12 - name.length) / 2
        val f2 = 12 - name.length - f1
        val s1 = (8 - salary.length) / 2
        val s2 = 8 - salary.length - s1

        print("|")
        print(" ".repeat(f1))
        print(name)
        print(" ".repeat(f2))
        print("|")
        print(" ".repeat(s1))
        print(salary)
        print(" ".repeat(s2))
        println("|")

    println("-".repeat(23))
    }
}

