import java.util.*

// 1 задание

//fun sumDigit(num: Int):Long = if(num!=0) {
//    val sum = sumDigit(num / 10)
//    sum + (num % 10)
//} else 0
//
//fun main() {
//    val input = Scanner(System.`in`)
//    val a = input.nextInt()
//    println("Сумма цифр: ${sumDigit(a)}")
//}

// 2 задание

fun sumDigit(num: Int, sum: Int = 0): Int = if (num != 0) {
    sumDigit(num / 10,sum + (num % 10))
} else sum

tailrec fun sumDigit(num: Int, sum: Int = 0): Int = if (num != 0) {
    sumDigit(num / 10,sum + (num % 10))
} else sum

fun main() {
    print("Введите число: ")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    println("Сумма цифр: ${sumDigit(a)}")
}