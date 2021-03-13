
package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(pedro)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("------- Subtract --------")
    val funcionarios3 = setOf(joao, maria, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------- Intersection --------")
    val resultIntersection = funcionarios3.intersect(funcionarios2)
    resultIntersection.forEach { println(it) }


}