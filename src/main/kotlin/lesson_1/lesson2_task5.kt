package lesson_1

fun main() {
    val secondsInSpace = 6480
    val secondsInMinute = 60
    val fullMinute = secondsInSpace / secondsInMinute
    val second = secondsInSpace - (fullMinute * secondsInMinute)
    val hour = fullMinute / secondsInMinute
    val minute = fullMinute - (hour * secondsInMinute)

    val result = String.format("%02d:%02d:%02d", hour, minute, second)
    println(result)
}
