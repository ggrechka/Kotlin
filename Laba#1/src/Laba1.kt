//1 задание
//fun main()=println("Hello World!")

//3 задание
    fun main() {
        if (args.size == 0) {
            print("Введите ваше имя:")
            return
        }
        println("Привет, ${args[0]}!")
        println("Привет, %s!".format(args[0]))
        println("Привет " + args[0]+ "!")
        println("Привет,\n${args[0]}\n!")

    }