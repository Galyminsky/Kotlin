package Day_2

fun main() {

    // Task 1
    val temperature = 30
    val isSunny = true
    if (temperature in 20..30 && isSunny) {
        println("Отличная погода для активного отдыха")
    }else if ((temperature <= 20) || (temperature >= 30) || !isSunny) {
        println("Погода не подходит...")
    }

    // Task 2
    val numberOfDishes = 4
    val pricePerDish = 300
    val resultPrice = numberOfDishes * pricePerDish
    println(resultPrice)

    // Task 3
    val isCompiled = false
    val isHighLevel = false
    val isScripting = true
    if (isCompiled && isHighLevel && isScripting) {
        println("It's is my PL")
    }else if (!isCompiled || !isHighLevel && !isScripting) {
        println("It's NOT my PL")
    }

    // Task 4
    val height = 175
    val currentWeight = 80.0F
    val idealWeight = (height - 100) * 1.15
    println(idealWeight)

    // Task 5
    val userName = "Lisander"
    val userAge = 55
    val welcomeTeen = "Добро пожаловать в мир программирования!"
    val welcomeMan = "Рад снова видеть тебя!"
    val welcomeDad = "Ты еще жив, старичек?"
    val privet = "Привет, "
    if (userAge <= 18) {
        println("$privet $userName $welcomeTeen")
    } else if (userAge in 18..40) {
        println("$privet $userName $welcomeMan")
    }else if (userAge in 40..100) {
        println("$privet $userName $welcomeDad")
    }

}