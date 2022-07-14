package eulerproject

/**
 * Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково. Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.

Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
 */
fun main() {
    println(numP())
}

fun numP(): Int {
    var result = 0
    var flag = true
    var i = 999
    var j = 999
    while (flag) {
        result = i * j
        i--
        j--
        if (result == result.toString().reversed().toInt()) {
            flag = false
        }
    }
    return result
}