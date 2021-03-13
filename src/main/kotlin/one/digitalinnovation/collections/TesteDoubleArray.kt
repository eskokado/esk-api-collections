package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 5000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.2
    }

    println("----------------------------")
    salarios.forEach { println(it) }

    println("----------------------------")
    val salarios2 = doubleArrayOf(1500.0, 5000.0, 2000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * 1.1
    }

    println("----------------------")
    salarios2.forEach { println(it) }
}