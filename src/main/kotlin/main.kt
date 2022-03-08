fun main() {
    val buySum = 550.00
    val totalSum = if (buySum > 10_001) buySum * 0.95 * 100 else if (buySum in 1_001.0..10_000.0) (buySum - 100) * 100
          else (buySum * 100)
    val musicLoverOrNot = true
    val finalAmount = if (musicLoverOrNot) totalSum * 0.99 else totalSum
    val finalAmountInteger = finalAmount / 100
    println("Общая сумма покупки - ${finalAmountInteger.toInt()} руб. ${finalAmount.toInt() % 100} коп.")
}