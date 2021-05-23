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




fun main() {

    val input = Scanner(System.`in`)
    println("Введите строку: ")
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для первого задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    val stroka = "234 3434 76453 3223 1 4 9 3 0"
//    println(obxodString(stroka))

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для второго задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//    5
    val stroka = "a 7 b 8 155 3 5 130"
    println(randomCharInString(stroka))
//

}