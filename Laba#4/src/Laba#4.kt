import java.io.File
import java.io.InputStream
import java.lang.Integer.toBinaryString
import java.util.*

fun printMass(mas: IntArray, i: Int = 0): String =
    if (i != mas.size) {
        println(mas[i])
        printMass(mas, i + 1)
    } else "\n"

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для первого задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
// попробовать через split
tailrec fun obxodString(s: String, inVal: Int = -100000): Int =
    if (s.isNotEmpty()) {
        val a = s.substringBefore(' ')
        if (a.toInt() > inVal) {
            obxodString(s.drop(a.length + 1), a.toInt())
        } else obxodString(s.drop(a.length + 1), inVal)

    } else inVal

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для второго задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//fun printMass(mas: CharArray, i: Int = 0): String =
//    if (i != mas.size) {
//        println(mas[i])
//        printMass(mas, i + 1)
//    } else "\n"

fun printMass2(mas: IntArray, i: Int = 0): String =
    if (i != mas.size) {
        println(mas[i])
        printMass2(mas, i + 1)
    } else "\n"

//5
fun randomCharInString(s: String): String {
    val listS = s.toList()
    val newS = listS.shuffled()
    var res = newS.toString()
    res = res.removeSurrounding("[", "]")
    res = res.replace(",", "")
    return res
}

//7
tailrec fun createArrayFromString(s: String, inVal: CharArray = CharArray(0), i: Int = 0): CharArray =
    if (i < s.length) {
        if (s[i] in 'a'..'z') {
            val temp = inVal + s[i]
            createArrayFromString(s, temp, i + 1)
        } else createArrayFromString(s, inVal, i + 1)

    } else inVal

fun Palindrom(s: CharArray, i: Int = 0): String =
    if (i < (s.size) / 2) {
        if (s[i] != s[s.size - i - 1]) {
            "не палиндром"
        } else Palindrom(s, i + 1)

    } else "палиндром"


fun main() {

    val input = Scanner(System.`in`)
//    println("Введите строку: ")
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для первого задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    val stroka = "234 3434 76453 3223 1 4 9 3 0"
//    println(obxodString(stroka))

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для второго задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//    5
//    val stroka = "a 7 b 8 155 3 5 130"
//    println(randomCharInString(stroka))

//    7
    val stroka1 = "a b Z d e x g e E" //пример для отриц.ответа
    val stroka2 = "a B c d e d c Z a" //пример для полож.ответа с неч.кол-вом символов
    val stroka3 = "a B c d e e d c Z a" //пример для полож.ответа с чётным кол-вом символов
    val stroka4 = "a B e d e d e a" //пример для полож.ответа c интересным случаем

    val mas = createArrayFromString(stroka4)
    println("Ваша строка ${Palindrom(mas)}")

}