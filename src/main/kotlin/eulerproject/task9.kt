package eulerproject

/**
Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство

                                a^2 + b^2 = c^2
Например, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

Существует только одна тройка Пифагора, для которой a + b + c = 1000.
Найдите произведение abc.
 */
fun main(){
    println(pifagor())
}

fun pifagor(): String {
    var result = ""
    for (i in 1..1000) {
        var a = i
        for (j in i + 1..1000) {
            var b = j
            var c = 1000 - a - b
            if (a * a + b * b == c * c) {
                result = "$a + $b + $c = 1000"
            }
        }
    }
    return result
}