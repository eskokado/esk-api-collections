package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    repositorio.listAll().forEach { println(it)}
    println("------------------------------")
    println(repositorio.findById(maria.nome))

    println("------------------------------")
    repositorio.remove(joao.nome)
    repositorio.listAll().forEach { println(it)}

}