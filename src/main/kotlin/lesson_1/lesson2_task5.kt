package lesson_1

fun main() {
    val secondsInSpace = 6480
    val second = secondsInSpace % 60
    val minute = secondsInSpace / 60 - 60
    val hour = secondsInSpace / 3600

    println("0$hour:$minute:0${second}")
}
