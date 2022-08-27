package poo

open class Eletronico(var marca: String) {

    private val s: String = ""

    protected fun ativarCorrente(s: String) {}

    // protected -> visivel apenas pela classe e suas herdeiras

    fun ligar() {
        ativarCorrente(s)
    }

    fun desligar() {

    }
}

class Computador(marca: String): Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {
        ativarCorrente("")
    }
}

fun main() {
    val computador = Computador("Dell")

    computador.ligar()
    computador.desligar()

    println(computador.marca)
}
