import java.util.*
import java.io.File
import java.io.InputStream


// чтение массива с клавиатуры
fun readMass(): IntArray {
    val input = Scanner(System.`in`)
    print("Введите размер массива: ")
    val n = input.nextInt()
    val mas = IntArray(n)
    println("Введите элементы массива: ")
    var i = 0
    while (i < n) {
        mas[i] = input.nextInt()
        i++
    }
    return mas
}

// печать массива
fun printMass(mas: IntArray, i: Int = 0): String =
    if (i != mas.size) {
        println(mas[i])
        printMass(mas, i + 1)
    } else "\n"


// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 1 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

tailrec fun sumDigit(num: Int, inVal: Int = 0): Int = if (num != 0) {
    sumDigit(num / 10, inVal + (num % 10))
} else inVal

tailrec fun minDigit(num: Int, inVal: Int = num % 10): Int = if (num != 0) {
    minDigit(num / 10, if (num % 10 < inVal) num % 10 else inVal)
} else inVal

tailrec fun maxDigit(num: Int, inVal: Int = num % 10): Int = if (num != 0) {
    maxDigit(num / 10, if (num % 10 > inVal) num % 10 else inVal)
} else inVal

tailrec fun proizDigit(num: Int, inVal: Int = 1): Int = if (num != 0) {
    proizDigit(num / 10, inVal * (num % 10))
} else inVal

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 2 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

tailrec fun arrayOp(mas: IntArray, f: (Int, Int) -> Int, inVal: Int, i: Int = 0): Int =
    if (i < mas.size) {
        val a = f(inVal, mas[i])
        arrayOp(mas, f, a, i + 1)
    } else inVal

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 3 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

fun sumDigit1(mas: IntArray): Int = arrayOp(mas, { sum, x: Int -> sum + x }, 0)


fun minDigit1(mas: IntArray): Int = arrayOp(mas, { min, x: Int -> if (x < min) x else min }, mas[0])

fun maxDigit1(mas: IntArray): Int = arrayOp(mas, { max, x: Int -> if (x > max) x else max }, mas[0])

fun proizDigit1(mas: IntArray): Int = arrayOp(mas, { pr, x: Int -> pr * x }, 1)




fun main() {
    val input = Scanner(System.`in`)
    val mas = readMass()

 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 1 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    println(
        "Выберите команду: \n" +
                "1.Поиск суммы элементов \n" +
                "2.Поиск минимального элемента \n" +
                "3.Поиск максимального элемента \n" +
                "4.Поиск произведения элементов"
    )
    when (input.nextInt()) {
        1 -> println("Сумма элементов: ${arrayOp(mas, ::sumDigit,0)}")
        2 -> println("Минимальный элемент: ${arrayOp(mas, ::minDigit,mas[0])}")
        3 -> println("Максимальный элемент: ${arrayOp(mas, ::maxDigit,mas[0])}")
        4 -> println("Произведение элементов: ${arrayOp(mas, ::proizDigit,1)}")
    }


 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 2 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    println(
        "Выберите команду: \n" +
                "1.Поиск суммы элементов \n" +
                "2.Поиск минимального элемента \n" +
                "3.Поиск максимального элемента \n" +
                "4.Поиск произведения элементов"
    )
    when (input.nextInt()) {
        1 -> println("Сумма элементов: ${arrayOp(mas, { sum, x: Int -> sum + x }, 0)}")
        2 -> println("Минимальный элемент: ${arrayOp(mas, { min, x: Int -> if (x<min) x else min}, mas[0])} ")
        3 -> println("Максимальный элемент: ${arrayOp(mas,  { max, x: Int -> if (x>max) x else max}, mas[0])}")
        4 -> println("Произведение элементов: ${arrayOp(mas, { pr, x: Int -> pr * x }, 1)}")
    }

 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 3 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

     println(
        "Выберите команду: \n" +
                "1.Поиск суммы элементов \n" +
                "2.Поиск минимального элемента \n" +
                "3.Поиск максимального элемента \n" +
                "4.Поиск произведения элементов"
    )
    when (input.nextInt()) {
        1 -> println("Сумма элементов: ${sumDigit1(mas)}")
        2 -> println("Минимальный элемент: ${minDigit1(mas)} ")
        3 -> println("Максимальный элемент: ${maxDigit1(mas)}")
        4 -> println("Произведение элементов: ${proizDigit1(mas)}")
    }

    // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   второе задание выполнено по дефолту   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
}