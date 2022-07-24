package eulerproject

/**
Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-е простое число - 13.

Какое число является 10001-м простым числом?
 */
fun main() {
    println(findSimple(10001))
}

fun isSimple(n: Long): Boolean{
    for (i in 2 until n) if (n%i==0L) return false
    return true
}

fun findSimple(n: Int): Long {
    val array = Array<Long>(n) {0}
    var number = 2L
    var index = 0
    while (true) {
        if (isSimple(number)) array[index++] = number
        if (index == n) break
        number++
    }
    return array.last()
}