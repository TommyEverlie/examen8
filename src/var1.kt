fun main() {
    // Coeficienții ecuației pătratice: ax^2 + bx + c = 0
    val a = 2.0
    val b = 5.0
    val c = 3.0

    // Verificăm dacă ecuația este validă (a ≠ 0)
    if (a == 0.0) {
        println("Nu este o ecuație pătratică, deoarece a = 0.")
        return
    }

    // Formula produsului rădăcinilor: c / a
    val produsRadacini = c / a
    println("Produsul rădăcinilor ecuației este: $produsRadacini")
}
