fun main() {
    val str = "Programação em Kotlin"

    println("Tamanho da String: ${str.length}")

    println("Posição 0 da String: ${str[0]}")
    println(str.startsWith("Pro", ignoreCase = true))
    println(str.endsWith("abc", ignoreCase = true))

    println(str.substring(2, 5))
    println(str.replace("Kotlin", "Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())

    println(str.trim())

    // Tirar espaços
    println("      string com espaços       ".trim())
}