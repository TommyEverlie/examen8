fun main() {
    print("Introduceți un număr întreg: ")
    val numar = readLine()?.toIntOrNull()

    if (numar != null && numar >= 100) {
        println("Numărul $numar este mai mare sau egal cu 100.")
    } else {
        println("Numărul nu este valid sau este mai mic decât 100.")
    }
}
