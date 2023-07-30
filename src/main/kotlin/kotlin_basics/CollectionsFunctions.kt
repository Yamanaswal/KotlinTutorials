package kotlin_basics

data class User(val name: String, val age: Int)
data class PaidUser(val name: String, val age: Int, val type: String)

fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7)

    val listFiltered = nums.filter { num -> num % 2 == 0 }
    println(listFiltered)

    val users = listOf<User>(
        User("Yaman", 25),
        User("Manish", 30),
        User("Sam", 22)
    )
    println(users)

    val mapList = users.map {
        PaidUser(it.name, it.age, "Paid")
    }
    println(mapList)

    //For Each
    users.forEach { println(it) }
}


