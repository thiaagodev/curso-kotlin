fun main() {
    print("Qual seu cargo?: ")
    val cargo: String? = readLine()

    val bonus = bonus(cargo)

    println("Seu bonus será $bonus")

}

// When

fun bonus(cargo: String?): Float {
    return when(cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" ->  500f
        else -> 0f
    }
}
