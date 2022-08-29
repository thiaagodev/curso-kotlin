package poo

interface Selvagem {
    fun atacar()

    val teste: String
}

abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("Dormi")
    }

    abstract fun falar()
    abstract fun comer()
}

class Cachorro(nome: String, override val teste: String): Mamifero(nome), Selvagem {
    override fun falar() {
        println("au au")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }

    override fun atacar() {


    }
}


fun main() {
    val cachorro = Cachorro("Thor", "asdaa")
}
