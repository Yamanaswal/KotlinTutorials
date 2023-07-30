package basics

fun main() {
    //Range
    val number = 5
    val result = number in 1..5 //1,2,3,4,5
    println(result)
    val result1 = number in 1 until 5 //1,2,3,4
    println(result1)
}