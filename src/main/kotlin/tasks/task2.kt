package tasks

/**
 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
 * Начиная с 1 и 2,первые 10 элементов будут:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 */

fun main() {
    println(sumOfEvenFib())
}

fun sumOfEvenFib(): Long {
    val array = Array<Long>(50) { 0 }
    array[0] = 0
    array[1] = 1

    for (i in 2 until array.size) {
        array[i] = array[i - 1] + array[i - 2]
    }
    var sum: Long = 0

    for (i in array.indices) {
        if ((array[i] % 2 == 0L) and (array[i] < 4000000)) {
            sum += array[i]
        }
    }

    return sum
}