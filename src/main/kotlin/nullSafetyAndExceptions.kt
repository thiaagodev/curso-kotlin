import java.lang.Exception

fun main() {
    var s: String? = null

    println(s?.length)

    // Exceções

    try {
        println(s!!.length)

        val a = 10 / 0

    } catch (e: NullPointerException) {
        println("Variável Nula")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } catch (e: Exception) {
        println("Exceção genérica")
    }
    finally {
        println("Será executado ao final")
    }


}

