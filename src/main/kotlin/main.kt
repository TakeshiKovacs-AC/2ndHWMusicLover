fun main() {
    val buySum = 14000.00
    val totalSum = (if (buySum > 10_001) buySum * 0.95
        else if (buySum > 1_001.0) buySum - 100
        else buySum) * 100
    val musicLoverOrNot = false
    val finalAmount = (if (musicLoverOrNot) totalSum * 0.99 else totalSum) / 100

    println("Общая сумма покупки - ${finalAmount.toInt()} руб. ${finalAmount.toInt() % 100} коп.")
}