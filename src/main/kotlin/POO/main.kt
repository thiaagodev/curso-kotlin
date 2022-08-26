package POO

class Pessoa(val anoNascimento: Int = 2020, var nome: String) {

    var olhos: String = ""

    fun dormir() {

    }

    fun acordar() {

    }
}



fun main() {
    // class - comportamentos e atributos

    var pessoa: Pessoa = Pessoa(2003, "Fulano")

    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos = "dsadsadsada"


}