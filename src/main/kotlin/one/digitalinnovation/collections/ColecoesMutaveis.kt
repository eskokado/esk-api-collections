package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    println("------ LIST ----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------- SET ---------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.add(maria)
    println("-------------------------")
    funcionariosSet.forEach { println(it) }

    funcionariosSet.remove(maria)
    println("-------------------------")
    funcionariosSet.forEach { println(it) }

}