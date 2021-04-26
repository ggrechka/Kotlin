import java.util.*
import kotlin.math.min

//1 задание
//fun main()=println("Hello World!")

//3 задание
//    fun main() {
//        if (args.size == 0) {
//            print("Введите ваше имя:")
//            return
//        }
//        println("Привет, ${args[0]}!")
//        println("Привет, %s!".format(args[0]))
//        println("Привет " + args[0]+ "!")
//        println("Привет,\n${args[0]}\n!")
//
//    }

//4 задание
//fun main() {
//    var stroka = readLine()
//    if (stroka != null) {
//        println("Метод length: ${stroka.length}")
//        println("Метод hashCode: ${stroka.hashCode()}")
//        println("Метод capitalize: ${stroka.capitalize()}")
//        println("Метод chunked: ${stroka.chunked(3)}")
//        println("Метод drop: ${stroka.drop(3)}")
//        println("Метод isEmpty: ${stroka.isEmpty()}")
//        println("Метод plus: ${stroka.plus("ssss")}")
//    }
//}

//5 задание
//fun main(args: Array<String>) {
//    if (args.size == 0) {
//        print("Введите ваше имя:")
//        return
//    }
//    println("Привет, ${args[0]}!")
//    println("Какой у тебя любимый язык(го на английском)?")
//    var language = readLine()
//    when (language) {
//        "Prolog", "Kotlin" -> println("Ну ты и подлиза...")
//        "C#" -> println("Я был о тебе лучшего мнения")
//        "Python" -> println("Уф, красавчик!")
//        "C++" -> println("Спасибо, что не Си.....")
//        "Pascal" -> println("Гаркуши на тебя нет...")
//        else -> println("Таких языков на ФКТиПМ не знают(грустняшка).")
//    }
//}

//6 задание

//fun main() {
//    print("Введите число: ")
//    //1 вариант ввода - спросить
//    //var a= readLine()
//    //var s= a?.toInt()
//
//    //2 вариант ввода
//    val input = Scanner(System.`in`)
//    var a = input.nextInt()
//    var aCopy = a
//    var sum = 0
//    while (a != 0) {
//        sum += a % 10
//        a = a/10
//    }
//    println("Сумма цифр числа $sum")
//
//    //Методы класса Int
//    println("Метод and: ${aCopy.and(10)}") // конъюнкция
//    println("Метод compareTo: ${aCopy.compareTo(11)}")
//    println("Метод dec: ${aCopy.dec()}")
//    println("Метод div: ${aCopy.div(2.5)}")
//    println("Метод minus:${aCopy.minus(3)}")
//    println("Метод rangeTo: ${aCopy.rangeTo(20)}")
//    println("Метод xor:${aCopy.xor(4)}")
//}

//7 задание

fun sumDigit(a: Int): Int {
    var sum = 0
    var aCopy = a
    while (aCopy != 0) {
        sum += (aCopy % 10)
        aCopy /= 10
    }

    return sum
}

fun searchMax(a: Int) :Int {
    var aCopy: Int = a
    var max = aCopy % 10
    while (aCopy != 0) {
        if (aCopy % 10 > max)
            max = aCopy % 10
        aCopy /= 10
    }
    return max
}

fun searchMin(a: Int) :Int {
    var aCopy: Int = a
    var min = aCopy % 10
    while (aCopy != 0) {
        if (aCopy % 10 < min)
            min = aCopy % 10
        aCopy /= 10
    }
    return min
}

fun searchProiz(a: Int) :Int {
    var aCopy: Int = a
    var p = 1
    while (aCopy != 0) {
        p*=aCopy%10
        aCopy /= 10
    }
    return p
}


fun main() {
    print("Введите число: ")
    val input = Scanner(System.`in`)
    var a = input.nextInt()
    println("Сумма цифр числа ${sumDigit(a)}")
    println("Максимальная цифра числа: ${searchMax(a)}")
    println("Минимальная цифра числа: ${searchMin(a)}")
    println("Произведение цифр числа: ${searchProiz(a)}")

}