package kotlin_basics

fun main() {
    var arr = arrayOf("One", "Two", "Three", 788, 222) //
    println(arr[0])
    println(arr[2])
    println(arr[3])
    println(arr[4])
    println(arr.size)

    var arr1 = arrayOf<Int>(2, 34, 55, 3)

    for (i in arr1) {
        println("Value: $i")
    }

    for ((i, e) in arr1.withIndex()) {
        println("$i - $e")
    }


    println(arr1.set(2,2344))
    println(arr1)
    println(arr1.get(0))

}