import java.io.File
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

//fun sumDigit(a: Int): Int {
//    var sum = 0
//    var aCopy = a
//    while (aCopy != 0) {
//        sum += (aCopy % 10)
//        aCopy /= 10
//    }
//
//    return sum
//}
//
//fun searchMax(a: Int) :Int {
//    var aCopy: Int = a
//    var max = aCopy % 10
//    while (aCopy != 0) {
//        if (aCopy % 10 > max)
//            max = aCopy % 10
//        aCopy /= 10
//    }
//    return max
//}
//
//fun searchMin(a: Int) :Int {
//    var aCopy: Int = a
//    var min = aCopy % 10
//    while (aCopy != 0) {
//        if (aCopy % 10 < min)
//            min = aCopy % 10
//        aCopy /= 10
//    }
//    return min
//}
//
//fun searchProiz(a: Int) :Int {
//    var aCopy: Int = a
//    var p = 1
//    while (aCopy != 0) {
//        p*=aCopy%10
//        aCopy /= 10
//    }
//    return p
//}
//
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    var a = input.nextInt()
//    println("Сумма цифр числа ${sumDigit(a)}")
//    println("Максимальная цифра числа: ${searchMax(a)}")
//    println("Минимальная цифра числа: ${searchMin(a)}")
//    println("Произведение цифр числа: ${searchProiz(a)}")
//
//}

//8 задание

//fun delWithout3(a: Int): Int {
//    var aCopy = a
//    var del = 1
//    for (i in 2..aCopy) {
//        if (aCopy % i == 0 && i%3!=0) del+=1
//    }
//    return del
//}
//
//fun searchMinNech(a: Int) :Int {
//    var aCopy: Int = a
//    var min = 10
//    while (aCopy != 0) {
//        if (aCopy % 10 < min && (aCopy % 10) % 2 == 1)
//            min = aCopy % 10
//        aCopy /= 10
//    }
//    return min
//}
//
//fun sumDigit(a: Int): Int {
//    var sum = 0
//    var aCopy = a
//    while (aCopy != 0) {
//        sum += (aCopy % 10)
//        aCopy /= 10
//    }
//
//    return sum
//}
//
//fun searchProiz(a: Int) :Int {
//    var aCopy: Int = a
//    var p = 1
//    while (aCopy != 0) {
//        p *= aCopy % 10
//        aCopy /= 10
//    }
//    return p
//}
//
//fun searchProst(a:Int,b:Int):Boolean{
//    for (i in 2..min(a,b))  if (a%i==0 && b%i==0) return false
//    return true
//}
//
////18:   сумма 9, произведение 8, делители: 1,2,3,6,9,18
//fun sumDel(a: Int): Int {
//    var aCopy = a
//    var sum = 0
//    for (i in 1..aCopy) {
//        if (aCopy % i == 0 && (searchProst(i, sumDigit(a)) && !searchProst(i, searchProiz(a)))) sum += i
//    }
//    return sum
//}
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    var a = input.nextInt()
//    println("Количество делителей числа, не кратных трём: ${delWithout3(a)}")
//    when(searchMinNech(a)){
//        10 -> println("Число чётное, нечётных цифр нет")
//        else -> println("Минимальная нечётная цифра: ${searchMinNech(a)}")
//    }
//    println("Сумма всех делителей числа, взаимно простых с суммой\n" +
//            "цифр числа и не взаимно простых с произведением цифр числа: ${sumDel(a)}")
//
//}

//9 задание

//fun searchMax(a: Int): Int {
//    var aCopy: Int = a
//    var max = aCopy % 10
//    while (aCopy != 0) {
//        if (aCopy % 10 > max)
//            max = aCopy % 10
//        aCopy /= 10
//    }
//    return max
//}
//
//fun searchMin(a: Int): Int {
//    var aCopy: Int = a
//    var min = aCopy % 10
//    while (aCopy != 0) {
//        if (aCopy % 10 < min)
//            min = aCopy % 10
//        aCopy /= 10
//    }
//    return min
//}
//
//fun delWithout3(a: Int): Int {
//    var aCopy = a
//    var del = 1
//    for (i in 2..aCopy) {
//        if (aCopy % i == 0 && i % 3 != 0) del += 1
//    }
//    return del
//}
//
//fun searchMinNech(a: Int): Int {
//    var aCopy: Int = a
//    var min = 10
//    while (aCopy != 0) {
//        if (aCopy % 10 < min && (aCopy % 10) % 2 == 1)
//            min = aCopy % 10
//        aCopy /= 10
//    }
//    return min
//}
//
//fun sumDigit(a: Int): Int {
//    var sum = 0
//    var aCopy = a
//    while (aCopy != 0) {
//        sum += (aCopy % 10)
//        aCopy /= 10
//    }
//
//    return sum
//}
//
//fun searchProiz(a: Int): Int {
//    var aCopy: Int = a
//    var p = 1
//    while (aCopy != 0) {
//        p *= aCopy % 10
//        aCopy /= 10
//    }
//    return p
//}
//
//fun searchProst(a: Int, b: Int): Boolean {
//    for (i in 2..min(a, b)) if (a % i == 0 && b % i == 0) return false
//    return true
//}
//
//
//fun sumDel(a: Int): Int {
//    var aCopy = a
//    var sum = 0
//    for (i in 1..aCopy) {
//        if (aCopy % i == 0 && (searchProst(i, sumDigit(a)) && !searchProst(i, searchProiz(a)))) sum += i
//    }
//    return sum
//}
//
//fun main() {
//    var f: Boolean = false
//    while (!f) {
//        println(
//            "Выберите команду: \n" +
//                    "1.Поиск суммы цифр числа \n" +
//                    "2.Поиск минимальной цифры \n" +
//                    "3.Поиск максимальной цифры \n" +
//                    "4.Поиск произведения цифр числа \n" +
//                    "5.Подсчитать количество делителей числа, не кратных трём \n" +
//                    "6.Поиск минимальной нечётной цифры \n" +
//                    "7.Поиск суммы всех делителей числа, взаимно простых с суммой цифр числа и не взаимно простых с произведением цифр числа \n" +
//                    "8.Выйти из программы"
//        )
//        val input = Scanner(System.`in`)
//        var command = input.nextInt()
//        if (command in 1..7) {
//            println("Введите число:")
//            val a = input.nextInt()
//            when (command) {
//                1 -> println("Сумма цифр: ${sumDigit(a)}")
//                2 -> println("Минимальная цифра: ${searchMin(a)}")
//                3 -> println("Максимальная цифра: ${searchMax(a)}")
//                4 -> println("Произведение цифр: ${searchProiz(a)}")
//                5 -> println("Количество делителей числа, не кратных трём: ${delWithout3(a)}")
//                6 -> println("Минимальной нечётной цифры: ${searchMinNech(a)}")
//                7 ->  println("Сумма уникальных делителей: ${sumDel(a)}")
//            }
//            println("Нажмите, чтобы продолжить..")
//            var step= readLine()
//        }
//        else {
//            print("До свидания!")
//            return
//        }
//    }
//}

//10 задание

//15
//fun solution(n: Int): Int {
//    var c = 1
//    for (i in 1..n)
//        c = c * (n + i) / i
//    return c
//}
//
//fun main() {
//    val input = Scanner(System.`in`)
//    println("Введите число:")
//    val a = input.nextInt()
//    println("Решение равно: ${solution(a)}")
//}

//22

fun readStrWord(fileName: String) = File(fileName).readText()
// бьём строку на имена
fun splitStrToWords(wordsInStr: String) = wordsInStr.split(",")
// удаляем кавычки из имён
fun rmQuotesFromWords(wordsWithQuotes: List<String>) : MutableList<String>
{
    val words: MutableList<String> = mutableListOf()
    wordsWithQuotes.forEach {
        words.add(it.removeSuffix("\"").removePrefix("\""))
    }
    return words
}
// набор функций для получения набора слов из файла
fun listOfWords(fileName: String) : List<String>
{
    // читаем файл в строку
    val wordsInStr = readStrWord(fileName)
    // бьём строку на имена и сортируем
    var wordsWithQuotes = splitStrToWords(wordsInStr)
    wordsWithQuotes = wordsWithQuotes.sorted()
    // удаляем кавычки из имён
    return rmQuotesFromWords(wordsWithQuotes)
}
// получаем лист со значениями из суммы букв
fun fWordScores(words: List<String>) : MutableList<Int>
{
    val wordScores: MutableList<Int> = mutableListOf()
    words.forEachIndexed() {
            index: Int, s: String ->
        run {
            var wordScore = 0
            s.forEach {
                wordScore += it.toInt() - 64
            }
            wordScore *= (index + 1)
            wordScores.add(wordScore)
        }
    }
    return wordScores
}
// получаем общее значение
fun fTotalWordScores(wordScores: MutableList<Int>) : Long
{
    var totalWordScores = 0L
    wordScores.forEach {
        totalWordScores += it
    }
    return totalWordScores
}
fun task1022(words: List<String>) : Long
{
    // получаем лист со значениями из суммы букв
    val wordScores = fWordScores(words)

    wordScores.forEachIndexed() {
            index: Int, s: Int ->
        println("${index + 1}: $s")
    }

    // получаем общее значение
    return fTotalWordScores(wordScores)
}
fun main(args: Array<String>) {
    val fileName = "C:/Users/Grechka/Documents/Programs/Laba#1/src/names.txt"
    val words = listOfWords(fileName)
    println("Сумма всех оценок имени: ${task1022(words)}")
}
