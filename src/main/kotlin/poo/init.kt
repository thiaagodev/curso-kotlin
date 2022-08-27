package poo

class Animal(var especie: String) {

    var fala: String = ""
        get() {
            println("Acesso GET")
            return field
        }
        set(value) {
            println("Acesso SET")
            field = value
        }



    init {
        if (especie == "cachorro") {
            fala = "au"
        } else if (especie == "gato") {
            fala = "miau"
        }
    }

    fun falar() {
        println(fala)
    }

}

fun main() {
    var a = Animal("cachorro")
    a.fala = "auuuuuuuu"

    var p: Planeta = Planeta()
    p.nome
}