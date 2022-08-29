package poo

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

class Cachorro(nome: String): Mamifero(nome) {
    override fun falar() {
        println("au au")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }
}


fun main() {
    val cachorro = Cachorro("Thor")
}
