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






fun main() {

    val input = Scanner(System.`in`)
    println("Введите строку: ")
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для первого задания  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    
    val stroka = "234 3434 76453 3223 1 4 9 3 0"
    println(obxodString(stroka))

}