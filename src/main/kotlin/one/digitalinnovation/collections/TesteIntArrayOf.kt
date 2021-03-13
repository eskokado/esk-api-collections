package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach { valor ->
        println(valor)
    }

    println("-------------------------------------")
    values.sort()
    values.forEach { valor ->
        println(valor)
    }
}