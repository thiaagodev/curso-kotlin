package poo

class Matematica {
    companion object {
        const val PI = 3.1415
        fun teste() {}

        init {
            println("Inciado")
        }
    }

    object obj1 {
        const val PI = 3.1415
    }

    object obj2 {
        const val PI = 3.1415
    }
}


fun main() {
    ExemploJava()
    ExemploJava()
    ExemploJava()
    ExemploJava()

    val ex = ExemploJava()

    println(ex.value)

    println(ExemploJava.valor)

    //

    Matematica.PI
    Matematica.teste()

    Matematica.obj1.PI
    Matematica.obj2.PI

    println(Matematica.PI)

    val m = Matematica()
    //m.PI -> ERRO
    //m.teste() -> ERRO


}