package kotlin_basics

fun main() {
    println(add(3.0, 4.8))

    //Lambdas Function - function without name
    var addFn: (x: Double, y: Double) -> Double = ::add
    println(addFn(23.9, 44.0))

    //Higher Order Functions - pass function as arguments
    val calculator = calculatorHigherOrder(3.9, 4.0, ::add)

    //multiline lambda - last line is return type
    val multiLineLambda = {
        println("I am multiline lambda..")
        val a = 99 + 11
        123
        a
    }
    println(multiLineLambda())

    val singleParamLambda = { a: Int, b: Int -> a * b }
    println(singleParamLambda(33,44))
}

fun calculatorHigherOrder(x: Double, y: Double, fn: (Double, Double) -> Double) {
    val result = fn(x, y)
    println(result)
//    return fn
}

fun add(a: Double, b: Double): Double {
    return a + b
}