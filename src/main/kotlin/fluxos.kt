fun main() {
    val n: Int = 1

    if(n >= 1 && n <= 50) {
        println("N está entre 1 e 50")
    }

    // utilizando operador in
    if(n in 1..50) {
        println("N está entre 1 e 50")
    }

    val test = "string"

    if("t" in test) {
        print("Achar caracteres em string com in")
    }

}

// When

fun bonus(cargo: String): Float {
    return when(cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" ->  500f
        else -> 0f
    }
}
