package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 2000.0)
    val pedro = Funcionario("Pedro", 4000.0)

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach {
        println("----------------------")
        println(it)
    }

    println("--------- Find -------------")
    println(funcionarios.find{it.nome == "Maria"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:       $nome
            Salário:    $salario
        """.trimIndent()
}