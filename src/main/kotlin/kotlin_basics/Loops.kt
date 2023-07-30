package kotlin_basics

fun main() {

    //While Loop
    var count = 5
    while (count >= 1) {
        println("Hello Bro")
        count--
    }

    //Do-While Loop
    var index = 7
    do {
        println("Hi Bro..")
        index--
    } while (index > 5)

    //For Loop
    for (i in 0..5){
        println("Output 1 -->: $i")
    }

    println("----- Steps -")
    for (i in 1..5 step 3){
        println("Output 2 -->: $i")
    }

    println("-----")
    for (i in 0 until 5){
        println("Output 3 --> : $i")
    }

    println("-----")

    //Reverse Loop
    for (i in 10 downTo 0 step 3){
        println("Output 4 --> : $i")
    }

}