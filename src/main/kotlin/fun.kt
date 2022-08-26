fun main() {
    helloWord()

    println(sum(5, 5))
    println(divisao(10.5f, 2f))

    println(media(10f, 2f, 10f))

    generic(10, 8, 2, "asdasdsadas", true)
}

// Função em única linha
fun sum(a: Int, b: Int): Int = a + b

fun helloWord() {
    println("Hello, World!")
}

fun divisao(a: Float, b: Float) = a / b

fun media(vararg notas: Float): Float {
    var soma = 0f

    for(n in notas) {
        soma += n
    }

    return soma / notas.size
}

fun <T> generic(vararg params: T) {
    for(param in params) {
        println(param)
    }
}


