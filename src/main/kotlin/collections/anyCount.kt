package collections

fun main() {
    val data = geraDados()

    // any / count

    println("Tenho dados? ${data.any()}")
    println(listOf<Int>().any())

    println("Tenho ${data.count()} dados.")

    println("Soma de calorias")
    println(data.sumOf { it.calorias })

    println(data.filter { it.calorias > 500 })

    println(data.count {it.calorias > 500})

    // take e takelast

    println(data.take(2))
    println(data.takeLast(2))

    // forEach

    data.forEach {
        println(it.nome)
    }

    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Max e Min
    println("A receita que tem mais calorias possui ${data.maxOf { it.calorias }} calorias")

    println(data.maxBy { it.calorias })

    listOf<Int>(1, 5, 8, 6, 7).max()
    listOf<Int>(1, 5, 8, 6, 7).maxOrNull()

    println("A receita que tem mais calorias possui ${data.minOf { it.calorias }} calorias")

    println(data.minBy { it.calorias })

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(
    val nome: String,
    val calorias: Int,
    val ingredientes: List<Ingrediente> = listOf()
)

data class Ingrediente(
    val nome: String,
    val quantidade: Int
)