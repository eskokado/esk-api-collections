package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Edson"
    nomes[1] = "Shideki"
    nomes[2] = "Kokado"

    nomes.forEach { nome ->
        println(nome)
    }

    println("------------------")
    nomes.sort()
    for (nome in nomes) {
        println(nome)
    }

    println("------------------")
    val nomes2 = arrayOf("Maria", "Jose", "Adriano")
    nomes2.sort()
    nomes2.forEach { println(it) }
}