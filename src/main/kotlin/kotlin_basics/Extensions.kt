package kotlin_basics

fun main() {
    println("Hello Extensions")
    println("Hello Extensions".formattedString())
    println("Hello Extensions".plus(22))

    //inline used for lambdas for performance boost
    val fn = {
        calculateValue({})
    }
    println(fn())
}

fun String.formattedString() {
    println("------> $this ------- current value printed here......")
}

inline fun calculateValue(value: () -> Unit) {
    println("Before" + System.currentTimeMillis())
    for (i in 0..1000000000) {
        //do nothing here
        for (i in 0..1000000000) {
            //do nothing here
        }
    }
    value()
    println("After" + System.currentTimeMillis())
}
