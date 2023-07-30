package basics

fun main() {

    val p1 = MyDataClass("Test1")
    val p2 = p1.copy(name = "New Test 1") //create new copy
    println(p1)
    println(p2)

}

//used to store data
data class MyDataClass(val name: String)