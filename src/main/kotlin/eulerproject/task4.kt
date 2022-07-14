package eulerproject

import java.util.*

/**
 * Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково. Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.

Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
 */
fun main() {
    println(numP())
}

fun numP(): Int {
    var result: Int
    val palindrome = mutableListOf<Int>()
    for (i in 100..999) {
        for (j in 100..999) {
            result = i * j
            if (result == result.toString().reversed().toInt()) {
                palindrome.add(result)
            }
        }
    }
    return Collections.max(palindrome)
}