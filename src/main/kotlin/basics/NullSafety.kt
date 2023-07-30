package basics

fun main() {

    var gender: String = "Male"
    println(gender)

    var gender1: String? = null
    println(gender1.plus(gender))


    println(gender1?.toUpperCase())
//    gender1 = "null"

    gender1.let { gender ->
        println("Gender: $gender")
    }

    //Elvis Operator
    val selected = gender1 ?: "NA"
    println(selected)

}