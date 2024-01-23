package lesson_1

fun main() {
    val hourOfDeparture = 9
    val minuteDeparture = 39
    val minutesInTravel = 457

    val minutesInHour = 60

    val hourOfArrival = hourOfDeparture + (minuteDeparture + minutesInTravel) / minutesInHour
    val minuteOfArrival = (minuteDeparture + minutesInTravel) % 60
    println("$hourOfArrival:$minuteOfArrival")
}