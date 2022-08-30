package collections

fun main() {
    val set1 = setOf<String>("Paris", "Berlim", "Madrid", "Paris")
    val set2 = mutableSetOf<String>()

    println(set1)

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")

    set2.clear()

}