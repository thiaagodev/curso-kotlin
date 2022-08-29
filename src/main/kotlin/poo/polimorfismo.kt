package poo

interface Funcionario {
    var salario: Float

    fun bonus(): Float
}

class Gerente(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }

}
class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }

}

fun mostraBonus(func: Funcionario) {
    println(func.bonus())
}

fun main() {
    // Herança
    // Encapsulamento
    // Abstração
    // Polimorfismo <-

    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(3000f))

}