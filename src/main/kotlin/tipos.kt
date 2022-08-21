import kotlin.reflect.typeOf

/**
 * Type Bit
 * Double 64
 * Float 32
 * Long 64
 * Int 32
 * Short 16
 * Byte 8
 * Boolean ?
 * String ?
 * Char ?
 * **/

fun tipos() {
    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

    var c: Char = 'a'
    var s: String = "asdasdsadsadasdasdasdsadsadasdsadasdasdsadsaads"
    var b: Boolean = true

    var f: Float = 10.5f
    var d: Double = 10.5

    var idade = 18

    println(idade.javaClass.kotlin)

    // Unsigned

    val abc: UInt = 256u


    val long: ULong = 1u
    val short: UShort = 1u
    val byte: UByte = 1u

}
