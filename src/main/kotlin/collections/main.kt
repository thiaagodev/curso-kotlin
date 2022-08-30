package collections


// List, Set, Map

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(list2.size)

    println(list2.first())
    println(list2.last())

    // sum & sumOf

    println("sum e sumOf:")
    println(list1.sum())

    list2.add(6)
    list2.remove(3)
    list2.removeAt(0)

    println(list2.contains(5))

    list2.clear()
    println(list2)
}