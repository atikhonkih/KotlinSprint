package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val reservationToday = NUMBER_OF_TABLES
    val reservationTomorrow = NUMBER_OF_TABLES - 4

    println("Доступность столиков на сегодя: ${reservationToday < NUMBER_OF_TABLES}\n" +
            "Доступность столиков на завтра: ${reservationTomorrow < NUMBER_OF_TABLES}")
}