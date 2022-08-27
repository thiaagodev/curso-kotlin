package poo

class Pessoa(val anoNascimento: Int = 2020, var nome: String) {

    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc: String): this(anoNascimento, nome) {
        this.doc = doc
    }

    var olhos: String = ""


    fun dormir() {

    }

    fun acordar() {

    }
}



fun main() {
    // class - comportamentos e atributos

    var pessoa: Pessoa = Pessoa(2003, "Fulano", "dsadsadsad")

    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos = "dsadsadsada"
    pessoa.doc


}