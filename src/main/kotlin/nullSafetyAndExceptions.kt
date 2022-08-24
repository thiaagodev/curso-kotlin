import java.lang.Exception

fun main() {
    val s: String? = null

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

    // Elvis

    val str: String? = null

    println(str ?: "nulo")

    // ternario
    println(if(str !== null) str else "Nulo")

    // let - executa o bloco caso não seja nulo
    println("Let")
    val strLet: String = "null"

    strLet?.let {
        println(it.length)
    }

}

