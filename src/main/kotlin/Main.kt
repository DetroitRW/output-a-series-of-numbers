import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите минимальное натуральное число: ")
    var a = reader.nextInt()

    print("Введите максимальное натуральное число: ")
    val b = reader.nextInt()

    print("Введите шаг: ")
    val c = reader.nextInt()

    println(a)

    while (a <= b && a + c <= b) {
        a += c
        println(a)
    }
}


