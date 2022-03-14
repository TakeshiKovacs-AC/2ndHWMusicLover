fun main() {
    val buySum = 18_603.48
    val totalSum = (if (buySum > 10_001) buySum * 0.95
        else if (buySum > 1_001.0) buySum - 100
        else buySum) * 100
    val musicLoverOrNot = true
    val finalAmount = (if (musicLoverOrNot) totalSum * 0.99 else totalSum).toInt()

    println("Общая сумма покупки - ${(finalAmount / 100)} руб. ${(finalAmount % 100)} коп.")
}