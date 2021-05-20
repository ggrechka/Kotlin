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
//fun proizDigit(num: Int):Long = if(num!=0) {
//    val proiz= proizDigit(num / 10)
//    proiz * (num % 10)
//} else 1
//
//tailrec fun proizDigit(num: Int, proiz: Int = 1): Int = if (num != 0) {
//    proizDigit(num / 10,proiz * (num % 10))
//} else proiz
//
//
////минимальная цифра числа
//fun minDigit(num: Int): Int {
//    val newNum = num / 10
//    val digit = num% 10
//
//    return if (newNum != 0) {
//        val min = minDigit(newNum)
//        if (digit < min)
//            digit
//        else min
//    }
//    else digit
//}
//
//tailrec fun minDigit(num: Int, min: Int = num%10): Int = if (num != 0) {
//    minDigit(num / 10, if (num%10<min) num%10 else min)
//} else min
//
//
////максимальная цифра числа
//fun maxDigit(num: Int): Int {
//    val newNum = num / 10
//    val digit = num% 10
//
//    return if (newNum != 0) {
//        val max = maxDigit(newNum)
//        if (digit > max)
//            digit
//        else max
//    }
//    else digit
//}
//
//tailrec fun maxDigit(num: Int, max: Int = num%10): Int = if (num != 0) {
//    maxDigit(num / 10, if (num%10>max) num%10 else max)
//} else max
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    val a = input.nextInt()
//    println("Максимальная цифра: ${maxDigit(a)}")
//    println("Произведение цифр: ${proizDigit(a)}")
//    println("Минимальная цифра: ${minDigit(a)}")
//}

// 4 задание

//fun sumDigit(num: Int): Int = if (num != 0) {
//    val sum = sumDigit(num / 10)
//    sum + (num % 10)
//} else 0
//
//fun proizDigit(num: Int): Int = if (num != 0) {
//    val proiz = proizDigit(num / 10)
//    proiz * (num % 10)
//} else 1
//
//fun minDigit(num: Int): Int {
//    val newNum = num / 10
//    val digit = num % 10
//
//    return if (newNum != 0) {
//        val min = minDigit(newNum)
//        if (digit < min)
//            digit
//        else min
//    } else digit
//}
//
//fun maxDigit(num: Int): Int {
//    val newNum = num / 10
//    val digit = num % 10
//
//    return if (newNum != 0) {
//        val max = maxDigit(newNum)
//        if (digit > max)
//            digit
//        else max
//    } else digit
//}
//
//fun searchDigit(num: Int, func: (number: Int) -> Int, inVal: Int = 0): Int =
//    func(num)
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    val a = input.nextInt()
//
//    println(
//        "Выберите команду: \n" +
//                "1.Поиск суммы цифр числа \n" +
//                "2.Поиск минимальной цифры \n" +
//                "3.Поиск максимальной цифры \n" +
//                "4.Поиск произведения цифр числа"
//    )
//    when (input.nextInt()) {
//        1 -> println("Сумма цифр: ${searchDigit(a, ::sumDigit)}")
//        2 -> println("Минимальная цифра: ${searchDigit(a, ::minDigit)}")
//        3 -> println("Максимальная цифра: ${searchDigit(a, ::maxDigit)}")
//        4 -> println("Произведение цифр: ${searchDigit(a, ::proizDigit)}")
//    }
//}

//5 задание

//tailrec fun sumDigit(num: Int, inVal: Int = 0): Int = if (num != 0) {
//    sumDigit(num / 10, inVal + (num % 10))
//} else inVal
//
//tailrec fun minDigit(num: Int, inVal: Int = num % 10): Int = if (num != 0) {
//    minDigit(num / 10, if (num % 10 < inVal) num % 10 else inVal)
//} else inVal
//
//tailrec fun maxDigit(num: Int, inVal: Int = num % 10): Int = if (num != 0) {
//    maxDigit(num / 10, if (num % 10 > inVal) num % 10 else inVal)
//} else inVal
//
//tailrec fun proizDigit(num: Int, inVal: Int = 1): Int = if (num != 0) {
//    proizDigit(num / 10, inVal * (num % 10))
//} else inVal
//
//
//
//fun searchDigit(num: Int, func1: (number: Int) -> Boolean, func2: (number: Int) -> Int, inVal: Int = 0): Int =
//    if (func1(num)) {
//        func2(num)
//    } else throw Exception()
//
//fun condition1(num: Int): Boolean =
//    if (num != 0) {
//        if (((num % 10) % 2) == 0) {
//            condition1(num / 10)
//        } else false
//    } else true
//
//fun condition2(num: Int): Boolean =
//    if (num != 0) {
//        if (((num % 10) % 2) == 1) {
//            condition2(num / 10)
//        } else false
//    } else true
//
//fun condition3(num: Int): Boolean =
//    if (num != 0) {
//        if (((num % 10) % 3) == 0) {
//            condition3(num / 10)
//        } else false
//    } else true
//
//fun checkCondition(check:String,num :Int):Boolean=
//    if (check=="1") {
//        condition1(num)
//    } else if (check=="2"){
//        condition2(num)
//    } else condition3(num)
//
//fun main() {
//    print("Введите число: ")
//    val input = Scanner(System.`in`)
//    val a = input.nextInt()
//
//    println(
//        "Выберите команду: \n" +
//                "1.Поиск суммы цифр числа \n" +
//                "2.Поиск минимальной цифры \n" +
//                "3.Поиск максимальной цифры \n" +
//                "4.Поиск произведения цифр числа"
//    )
//    val command=input.nextInt()
//    println(
//        "Выберите условие фильтрации: \n" +
//                "1.Все цифры числа чётные \n" +
//                "2.Все цифры числа нечётные \n" +
//                "3.Все цифры числа кратны 3"
//    )
//    val condition=input.nextInt()
//    try {
//        when (command) {
//            1 -> println("Сумма цифр: ${searchDigit(a,  if (condition==1) ::condition1 else if (condition==2) ::condition2 else ::condition3, ::sumDigit)}")
//            2 -> println("Минимальная цифра: ${searchDigit(a,  if (condition==1) ::condition1 else if (condition==2) ::condition2 else ::condition3, ::minDigit)}")
//            3 -> println("Максимальная цифра: ${searchDigit(a,  if (condition==1) ::condition1 else if (condition==2) ::condition2 else ::condition3, ::maxDigit)}")
//            4 -> println("Произведение цифр: ${searchDigit(a,  if (condition==1) ::condition1 else if (condition==2) ::condition2 else ::condition3, ::proizDigit)}")
//        }
//    } catch (e: Exception) {
//        println("Условие не пройдено")
//    }
//}

//6 задание


// ВХОДНЫЕ ДАННЫЕ:
// число 2468
// Выберите команду: 3
// Выберите условие фильтрации: 1

// В операторе "when" программа заходит в 3 альтернативу и вызывает функцию  searchDigit, которая в свою очередь
// осуществляет выбор условия фильтрации с помощь тернарного оператора.
// В нашем случае условие фильтрации - все цифры числа чётные.В функции condition1 идёт проверка каждой
// цифры на чётность. В случае, если условие будет нарушено, программа выдаст исключение, которое обработается и
// в консоль выведется "Условие на пройдено".
// В нашей ситуации, условие не нарушается и searchDigit переводит на maxDigit, которая ищет в числе максимальную цифру
// Результат поиска выводится на экран

// ВХОДНЫЕ ДАННЫЕ:
// число 132
// Выберите команду: 1
// Выберите условие фильтрации: 2

// В операторе "when" программа заходит в 1 альтернативу и вызывает функцию  searchDigit, которая в свою очередь
// осуществляет выбор условия фильтрации с помощь тернарного оператора.
// В нашем случае условие фильтрации - все цифры числа нечётные.В функции condition2 идёт проверка каждой
// цифры на чётность. В случае, если условие будет нарушено, программа выдаст исключение, которое обработается и
// в консоль выведется "Условие на пройдено" и это как раз наша ситуация

// ВХОДНЫЕ ДАННЫЕ:
// число 33339
// Выберите команду: 4
// Выберите условие фильтрации: 4

// В операторе "when" программа заходит в 4 альтернативу и вызывает функцию  searchDigit, которая в свою очередь
// осуществляет выбор условия фильтрации с помощь тернарного оператора.
// В нашем случае условие фильтрации - все цифры числа кратны 3.В функции condition3 идёт проверка каждой
// цифры на кратность 3. В случае, если условие будет нарушено, программа выдаст исключение, которое обработается и
// в консоль выведется "Условие на пройдено".
// В нашей ситуации, условие не нарушается и searchDigit переводит на proizDigit, которая ищет произведение цифр
// Результат поиска выводится на экран