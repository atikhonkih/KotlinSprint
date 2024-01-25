package lesson_4

fun main() {
    val isSunnyToday = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"

    val growthConditions = isSunnyToday && isTentOpen && humidity == 20 && season != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $growthConditions")
}