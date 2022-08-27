package poo

fun main() {
    val p: Pessoa = Pessoa(1985, "Frank")

    p.acordar()
    p.dormir()

    with(p) {
        acordar()
        dormir()
    }
}