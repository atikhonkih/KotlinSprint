package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val volume = 100

    val cargoWeight1 = 20
    val cargoVolume1 = 80
    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует " +
            "категории 'Average': ${cargoWeight1 >= minWeight && cargoWeight1 <= maxWeight 
                    && cargoVolume1 < volume}")

    val cargoWeight2 = 50
    val cargoVolume2 = 100
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует " +
            "категории 'Average': ${cargoWeight2 >= minWeight && cargoWeight2 <= maxWeight
                    && cargoVolume2 < volume}")
}