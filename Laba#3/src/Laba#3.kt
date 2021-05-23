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

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для третьего задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

fun readMassFromFile(): IntArray {
    val inputStream: InputStream = File("C:/Users/Grechka/Documents/Programs/Laba#3/src/massiv.txt").inputStream()
    val reader = inputStream.bufferedReader()
    var mas = IntArray(0)
    reader.forEachLine { mas += it.toInt() }
    return mas
}

fun chooseMas(a: Int): () -> IntArray = {
    when (a) {
        1 -> readMass()
        else -> readMassFromFile()
    }
}
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.5  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

fun checkElem(mas: IntArray, inVal: Int): String {
    if (minDigit1(mas) == mas[inVal])
        return "равен глобальному минимуму"
    return "не равен глобальному минимуму"
}
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.6  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*


// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.17  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
tailrec fun findNum(mas: IntArray, inVal: Int, j: Int = 0): Int =
    if (j < mas.size) {
        if (mas[j] == inVal)
            j
        else findNum(mas, inVal, j + 1)
    } else inVal

fun swapMinMax(mas: IntArray): IntArray {
    val inMin = findNum(mas, minDigit1(mas))
    val inMax = findNum(mas, maxDigit1(mas))
    var a = 0
    a = mas[inMax]
    mas[inMax] = mas[inMin]
    mas[inMin] = a
    return mas
}
// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.19 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.29 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

fun checkMax(mas: IntArray, a: Int, b: Int): String {
    val inMax = findNum(mas, maxDigit1(mas))
    if (inMax in a..b)
        return "входит в промежуток"
    return "не входит в промежуток"
}

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.41,47   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

tailrec fun delDigit(num: Int, inVal: IntArray = IntArray(0), i: Int = 1): IntArray =
    if (i <= num) {
        if (num % i == 0) {
            delDigit(num, inVal + i, i + 1)
        } else delDigit(num, inVal, i + 1)
    } else inVal

tailrec fun allDel(mas: IntArray, inVal: IntArray, j: Int = 0): IntArray = if (j < mas.size) {
    val ex = delDigit(mas[j])
    var ins = inVal
    ex.forEach { ins += it.toInt() }
    allDel(mas, ins, j + 1)
} else inVal


fun main() {
    val input = Scanner(System.`in`)
//    val mas = readMass()

 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 1 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    println(
//        "Выберите команду: \n" +
//                "1.Поиск суммы элементов \n" +
//                "2.Поиск минимального элемента \n" +
//                "3.Поиск максимального элемента \n" +
//                "4.Поиск произведения элементов"
//    )
//    when (input.nextInt()) {
//        1 -> println("Сумма элементов: ${arrayOp(mas, ::sumDigit,0)}")
//        2 -> println("Минимальный элемент: ${arrayOp(mas, ::minDigit,mas[0])}")
//        3 -> println("Максимальный элемент: ${arrayOp(mas, ::maxDigit,mas[0])}")
//        4 -> println("Произведение элементов: ${arrayOp(mas, ::proizDigit,1)}")
//    }


 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 2 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    println(
//        "Выберите команду: \n" +
//                "1.Поиск суммы элементов \n" +
//                "2.Поиск минимального элемента \n" +
//                "3.Поиск максимального элемента \n" +
//                "4.Поиск произведения элементов"
//    )
//    when (input.nextInt()) {
//        1 -> println("Сумма элементов: ${arrayOp(mas, { sum, x: Int -> sum + x }, 0)}")
//        2 -> println("Минимальный элемент: ${arrayOp(mas, { min, x: Int -> if (x<min) x else min}, mas[0])} ")
//        3 -> println("Максимальный элемент: ${arrayOp(mas,  { max, x: Int -> if (x>max) x else max}, mas[0])}")
//        4 -> println("Произведение элементов: ${arrayOp(mas, { pr, x: Int -> pr * x }, 1)}")
//    }

 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для 3 части первого задания   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//     println(
//        "Выберите команду: \n" +
//                "1.Поиск суммы элементов \n" +
//                "2.Поиск минимального элемента \n" +
//                "3.Поиск максимального элемента \n" +
//                "4.Поиск произведения элементов"
//    )
//    when (input.nextInt()) {
//        1 -> println("Сумма элементов: ${sumDigit1(mas)}")
//        2 -> println("Минимальный элемент: ${minDigit1(mas)} ")
//        3 -> println("Максимальный элемент: ${maxDigit1(mas)}")
//        4 -> println("Произведение элементов: ${proizDigit1(mas)}")
//    }

    // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   второе задание выполнено по дефолту   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   третье задание   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//
//    println(
//        "Выберите команду: \n" +
//                "1.Чтение массива с клавиатуры \n" +
//                "2.Чтение массива с файла \n"
//    )
//    val func = chooseMas(input.nextInt())
//    val mas = func()
//    printMass(mas)

    // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   четвёртое задание.5   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//    println("Введите индекс: ")
//    val index = input.nextInt()
//    println("Ваш индекс ${checkElem(mas, index)}")

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   четвёртое задание.6   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.17  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    println("Ваш свапнутый массив:")
//    printMass(swapMinMax(mas))

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.19  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.26 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    val min1 = arrayOp(mas, { min, x: Int -> if (x < min) x else min }, 10000)
//    val min2 = arrayOp(mas, { min, x: Int -> if (x < min && x != min1) x else min }, 10000)
//    val inMin1 = findNum(mas, min1)
//    val inMin2 = findNum(mas, min2)
//    println(min1)
//    println(min2)
//    if (inMin1>inMin2) println("Количество элементов между первым и вторыми минимумом:${inMin1-inMin2-1}")
//    else println("Количество элементов между первым и вторыми минимумом:${inMin2-inMin1-1}")

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   для четвёртого задания.29 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
//      println("Введите а: ")
//      val a = input.nextInt()
//      println("Введите b: ")
//      val b = input.nextInt()
//      println("Ваш максимум ${checkMax(mas, a,b)}")

// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   четвёртое задание.41   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

//    val mas = readMass()
//    val sum = arrayOp(mas, { sum, x: Int -> abs(sum) + abs(x) }, 0)
//    val size = mas.size
//
//    println("Среднее арифметическое: ${sum.toFloat()/size.toFloat()}")

    // -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*   четвёртое задание.47   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    val mas = readMass()
    var alldelit=allDel(mas,IntArray(0))
    val numbers = alldelit.toSet()
    val numbers2 = numbers.toIntArray()

    println("Неповторяющиеся делители для вашей последовательности:")
    printMass(numbers2.sortedArray())



}