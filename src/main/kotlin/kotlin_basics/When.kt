package kotlin_basics

fun main() {
    val animal = "Dog"

    //If-Else
    /*    if (animal == "Horse") {
            println("Animal is Horse.")
        } else if (animal == "Cat") {
            println("Animal is Cat.")
        } else if (animal == "Dog") {
            println("Animal is Dog.")
        } else {
            println("Animal is not found.")
        }*/

    when (animal) {
        "Horse" -> println("Animal is Horse.")
        "Cat" -> println("Animal is Cat.")
        "Dog" -> println("Animal is Dog.")
        else -> println("Animal is not found.")
    }

    //As a Expression
    val res = when (animal) {
        "Horse" -> "Animal is Horse."
        "Cat" -> "Animal is Cat."
        "Dog" -> "Animal is Dog."
        else -> "Animal is not found."
    }

    println(res)


}