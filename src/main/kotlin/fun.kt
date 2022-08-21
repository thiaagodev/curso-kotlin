fun main() {
    helloWord()

    println(sum(5, 5))
    println(divisao(10.5f, 2f))
}

// Função em única linha
fun sum(a: Int, b: Int): Int = a + b

fun helloWord() {
    println("Hello, World!")
}

fun divisao(a: Float, b: Float) = a / b
