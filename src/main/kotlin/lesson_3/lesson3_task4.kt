package lesson_3

fun main() {
    var moveCounter = 1
    var moveFrom = "E2"
    var moveWhere = "E4"

    var move = "$moveFrom-$moveWhere;$moveCounter"
    println(move)

    moveCounter = 2
    moveFrom = "D2"
    moveWhere = "D3"

    move = "$moveFrom-$moveWhere;$moveCounter"
    println(move)
}