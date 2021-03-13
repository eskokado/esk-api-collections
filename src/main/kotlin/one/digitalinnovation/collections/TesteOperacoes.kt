package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 2500.0, 4000.0, 3000.0)

    println("-----------------------")
    println("Mínimo: ${salarios.min()}")

    println("Média: ${salarios.average()}")

    println("Máximo: ${salarios.max()}")

    println("Salários maior que 2500")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }
}