package lesson_3

fun main() {
    val playerMove = "D2-D4;0"
    val move = playerMove.split(';', '-')

    val moveCounter = move[2]
    val moveFrom = move[0]
    val moveWhere = move[1]
    println(moveCounter)
    println(moveFrom)
    println(moveWhere)
}