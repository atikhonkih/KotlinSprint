package lesson_2

import kotlin.math.pow

fun main() {
    val initialSum = 70000
    val annualRate = 16.7
    val period = 20

    val deposit = initialSum * (1 + annualRate / 100).pow(period)
    println("%.3f".format(deposit))
}