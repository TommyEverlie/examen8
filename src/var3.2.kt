fun calc(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun main() {
    println(calc())
    println(calc(5))
    println(calc(5, 12))
}
