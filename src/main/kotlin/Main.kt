
fun main() {
    var nome: String? = null
    println(tipos())

    // Any, Unit e Nothing

    valores(false)
}

fun valores(value: Any): Unit {
    // corpo
    // -> Unit = não tem retorno
}

fun valores2(value: Any): Nothing {
    TODO("Não Implementado")
    // Nothing = NADA
}

