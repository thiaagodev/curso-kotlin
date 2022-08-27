package poo

enum class Prioridade(val id: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade Baixa: $id"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}

fun x(p: Prioridade) {
    println(p)
}


fun main() {
    x(Prioridade.Baixa)

    for (p in Prioridade.values()) {
        println(p)
    }
}