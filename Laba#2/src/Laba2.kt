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

//fun sumDigit(num: Int, sum: Int = 0): Int = if (num != 0) {
//    sumDigit(num / 10,sum + (num % 10))
//} else sum
//
//tailrec fun sumDigit(num: Int, sum: Int = 0): Int = if (num != 0) {
//    sumDigit(num / 10,sum + (num % 10))
//} else sum
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    val a = input.nextInt()
//    println("Сумма цифр: ${sumDigit(a)}")
//}


// 3 задание

//произведение цифр числа
fun proizDigit(num: Int):Long = if(num!=0) {
    val proiz= proizDigit(num / 10)
    proiz * (num % 10)
} else 1

tailrec fun proizDigit(num: Int, proiz: Int = 1): Int = if (num != 0) {
    proizDigit(num / 10,proiz * (num % 10))
} else proiz


//минимальная цифра числа
fun minDigit(num: Int): Int {
    val newNum = num / 10
    val digit = num% 10

    return if (newNum != 0) {
        val min = minDigit(newNum)
        if (digit < min)
            digit
        else min
    }
    else digit
}

tailrec fun minDigit(num: Int, min: Int = num%10): Int = if (num != 0) {
    minDigit(num / 10, if (num%10<min) num%10 else min)
} else min


//максимальная цифра числа
fun maxDigit(num: Int): Int {
    val newNum = num / 10
    val digit = num% 10

    return if (newNum != 0) {
        val max = maxDigit(newNum)
        if (digit > max)
            digit
        else max
    }
    else digit
}

tailrec fun maxDigit(num: Int, max: Int = num%10): Int = if (num != 0) {
    maxDigit(num / 10, if (num%10>max) num%10 else max)
} else max

fun main() {
    print("Введите число: ")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    println("Максимальная цифра: ${maxDigit(a)}")
    println("Произведение цифр: ${proizDigit(a)}")
    println("Минимальная цифра: ${minDigit(a)}")
}
