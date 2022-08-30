package collections

fun main() {

    // CHAVE->VALOR

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries)
    println(map1.values)

    map2["Brasil"] = "Brasília"
    map2.remove("Alemanha")
    println(map2)

    println(map2.contains("Brasil"))
    println(map2["Brasil"])

    map2.clear()

}