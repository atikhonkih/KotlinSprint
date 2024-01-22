package lesson_1

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployee = 30000
    val numberOfTrainees = 20
    val salaryOfTrainee = 20000

    val salaryOfEmployees = numberOfEmployees * salaryOfEmployee
    println(salaryOfEmployees)

    val salary = numberOfTrainees * salaryOfEmployee + numberOfTrainees * salaryOfTrainee
    println(salary)

    val midSalary = salary / (numberOfEmployees + numberOfTrainees)
    println(midSalary)
}