package Day_2

fun main() {

   val sleepDuration = 5
   val hasDreams = false
   val wokeUpNaturally = true
   if (sleepDuration in 5..8 && hasDreams && wokeUpNaturally) {
      println("Good Dreams")
   } else if (sleepDuration in 5..8 && (!hasDreams || !wokeUpNaturally)) {
      println("Bad Dreams")
   } else if (sleepDuration in 1..5 && hasDreams && wokeUpNaturally) {
      println("Fuck Dreams")
   }

}