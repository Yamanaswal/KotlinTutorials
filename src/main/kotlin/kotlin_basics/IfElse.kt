package kotlin_basics

fun main() {
    val isRaining = true

    if (isRaining) {
        println("Take Umbrella.")
    } else if (isRaining) {
        println("Take Another Umbrella.")
    } else {
        println("No Rains.. Go Outside.")
    }

    //Use as Expression
    //Note: Kotlin Does Not Have Ternary operator.
    val number = 22
    val result = if (number % 2 == 0) "Even" else "Odd"
    println(result)
    
}