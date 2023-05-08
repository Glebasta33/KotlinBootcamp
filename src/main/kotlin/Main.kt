fun main() {
    //TODO: 1. Создать класс Car, с полями марка, мощность двигателя, объём бензобака, дата производства.
    //TODO: 2. Создать массив из 5 разных автомобилей.
    //TODO: 3. Сортировать 1) по дате выпуска и 2) по мощности двигателя и вывести в консоль.
    data class Car(
        val brand: String,
        val power: Int,
        val volume: Int,
        val year: Int
    )

    val listOfCars = mutableListOf<Car>()

    val bmw: Car = Car("BMW X6", 100, 80,2010)
    val toyota: Car = Car("Toyota Camry", 34,45,2015)
    val lada: Car = Car ("Lada Priora", 13,15,2008)
    val mercesedess = Car("mercedessb benz", 34, 45, 2006)

    listOfCars.addAll(
        arrayOf(bmw, toyota, lada, mercesedess))

    listOfCars.sortBy{it.year}
    println(listOfCars)

    listOfCars.sortBy{it.power}
    println(listOfCars)
    }
