package poo

interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(event: Event) {
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso. Conexões fechadas.")
        event.onSucess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object: Event {
        override fun onSucess() {
            println("Sucesso!")
        }

    })

}
