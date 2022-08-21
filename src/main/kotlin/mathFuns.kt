import kotlin.math.*

fun main() {
    // Funções Matemáticas
    println(max(5, 10))
    println(min(5, 10))
    println(sqrt(45.10f))
    println(PI)
    println(E)
    println(round(13.569))

    // Exercícios de Funções
    println(convertYear(2))
    println(lenOfString("Teste"))
    println(calcCube(5))
    println(convertMhToKm(1))

    convertString("Abacaxi")
}

fun convertYear(years: Int): String {
    val months: Int =  years * 12
    val days: Int = years * 365
    val hours: Int = days * 24
    val minutes: Int = hours * 60
    val seconds: Int = minutes * 60

    return "$years anos equivalem a: \n" +
            "$months meses\n" +
            "$days dias\n" +
            "$hours horas\n" +
            "$minutes minutos\n" +
            "$seconds segundos\n"

}

fun lenOfString(str: String) = str.length

fun calcCube(number: Int) = number*number*number

fun convertMhToKm(mh: Int): Double = mh * 1.609

fun convertString(str: String) = println(str.replace("a", "x", ignoreCase = true))
