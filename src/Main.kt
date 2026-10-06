fun main() {
    // Variables de usuario
    val nombreUsuario: String = "Benjamin"
    var saldoDisponible: Double = 25.0
    val tieneDescuento: Boolean = true

    // Lista de apps y lista de precios
    val appsEnCarrito: List<String> = listOf("Juego RPG", "Editor de Fotos Pro", "App de Clima")
    val precios: List<Double> = listOf(9.99, 12.50, 4.00)

    // Cálculos básicos
    val totalOriginal: Double = precios[0] + precios[1] + precios[2]
    val totalFinal: Double = if (tieneDescuento) totalOriginal * 0.90 else totalOriginal // 10% de descuento

    //Saldo restante
    var saldoRestante: Double = saldoDisponible - totalFinal

    // Salida
    println("--- RESUMEN DE COMPRA ---")
    println("Usuario: $nombreUsuario")
    println("Tiene descuento: $tieneDescuento")
    println("Objetos seleccionados: ${appsEnCarrito.size}")
    println("Primer Objeto: ${appsEnCarrito[0]} | Segundo Objeto: ${appsEnCarrito[1]}| Última Objeto: ${appsEnCarrito[2]}")
    println("Total a pagar: S/ $totalFinal")
    println("Saldo Restante: $saldoRestante")

    // Comprobamos si el saldo alcanza
    val puedeComprar: Boolean = saldoDisponible >= totalFinal
    println("¿Compra fue aprobada?: $puedeComprar")
}