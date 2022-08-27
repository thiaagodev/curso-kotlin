package poo

class Receita {
    //var instrucoes: String? = null
    lateinit var instrucoes: String

    fun gerarReceita() {
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita() {
        if(!this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos."
        }
    }
}


fun main() {
    var r: Receita = Receita()
    r.gerarReceita()

    println(r.instrucoes)
}