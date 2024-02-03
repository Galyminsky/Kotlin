package Day_2

fun main() {
    println("Введите число для таблицы умножения:")
    val number = readlnOrNull()?.toInt()
    if (number != null) {
        println("\n Таблица умноженения для числа: $number \n")
        for (i in 1..10) {
            val result = i * number
            println("$i * $number = $result")
        }
    } else {
        println("Error")
    }
}