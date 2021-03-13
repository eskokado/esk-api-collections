package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach {
        println("----------------------")
        println(it)
    }

    println("--------- Find -------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("--------- SortBy -------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("--------- GroupBy -------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:       $nome
            Salário:    $salario
        """.trimIndent()
}