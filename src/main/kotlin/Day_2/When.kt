package Day_2

fun main() {
    println("Введите первое число:")
    val numberOne = readlnOrNull()?.toIntOrNull() ?: 0
    println("Введите знак действия:")
    val action = readlnOrNull()
    println("Введите второе число:")
    val numberTwo = readlnOrNull()?.toIntOrNull() ?: 0

    val result = when (action) {
        "+" -> numberOne + numberTwo
        "-" -> numberOne - numberTwo
        "*" -> numberOne * numberTwo
        "/" -> numberOne / numberTwo
        else -> null
    }

    if (result != null) {
        println("Result: $result")
    } else {
        println("Error")
    }

}
fun readlnOrNull(): String? {
    return kotlin.io.readlnOrNull()
}


