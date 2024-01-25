package lesson_3

fun main() {
    val citizenName = "Татьяна"
    var citizenSurname = "Андреева"
    val citizenMiddleName = "Сергеевна"
    var citizenAge = 20

    println("$citizenSurname $citizenName, $citizenMiddleName, $citizenAge")

    citizenSurname = "Сидорова"
    citizenAge = 22
    println("$citizenSurname $citizenName, $citizenMiddleName, $citizenAge")
}