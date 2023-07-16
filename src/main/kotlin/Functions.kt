fun main() {
    val res1 = add(3, 4)
    println(res1)
    val res2 = evenOrOdd(11)

    printMessage(5) //5 is argument
    printMessage()
    println(addition(33,44))
    println(addition(num2 = 44.0,num1 = 33.0)) //Named Argument

    val fn = ::add
    println(fn(22,33))
}

fun printMessage(i: Int = 1) { // here - i is parameter which is val type
    println("Hello $i")
}

/*fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}*/

//Inline Function
fun add(num1: Int, num2: Int): Int = num1 + num2

//Default Return Type = Unit
fun evenOrOdd(num: Int): Unit {
    println(if (num % 2 == 0) "Even" else "Odd")
}

fun addition(num1: Int, num2: Int): Int{
    return num1 + num2
}


fun addition(num1: Double, num2: Double): Double{
    return num1 + num2
}
