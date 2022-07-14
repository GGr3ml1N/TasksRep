package tasks

/**
 * Простые делители числа 13195 - это 5, 7, 13 и 29.

 * Каков самый большой делитель числа 600851475143, являющийся простым числом?
 */
fun main() {
    var num: Long = 60085147514
    var count: Long = 1
    while (num!=1L) {
        count +=1
        if (num%count ==0L) num/=count
    }
    println(count)
}


