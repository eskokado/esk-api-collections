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

    println("----------------------------")
    println("Count: ${salarios.count { it in 2000.0..3500.0}}")

    println("----------------------------")
    println("Existe: ${salarios.find { it == 2500.0}}")
    println("Não Existe: ${salarios.find { it == 700.0}}")

    println("----------------------------")
    println("Existe Salários igual a 2500.0: ${salarios.any { it == 2500.0}}")
    println("Existe Salários igual a 700.0: ${salarios.any { it == 700.0}}")

}