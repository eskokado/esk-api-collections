package one.digitalinnovation.collections

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf(
        "1000".toBigDecimal(),
        "5000".toBigDecimal(),
        "2000".toBigDecimal(),
        "500".toBigDecimal()
    )

    println("Soma: ${salarios.somatoria()}")
    println("Soma: ${salarios.media()}")
}