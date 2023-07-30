package basics

fun main() {
    //UnMutable List
    val nums = listOf(1, 2, 3)
    println(nums.indexOf(3)) // find value index
    println(nums.contains(4)) //find element
    println(nums)

    //Mutable List - which can be changed.
    val nums1 = mutableListOf(1, 2, 3, 4, 5)
    println(nums1.add(9))
    println(nums1.removeAt(2))
    println(nums1)


    //Create Map
    val students = mutableMapOf<Int, String>(7 to "No Name")
    students.put(1, "Yaman")
    students.put(2, "Manish")
    println(students)

    //Get Value From Map
    println(students.get(2))
    println(students[2])

    //Iterate on Map
    for ((key, value) in students) {
        println("Key of $key has value $value")
    }

    //Set Data in Map
    students[3] = "Wrong Data"
    students[3] = "Sanjay"
    println(students)
    println(students.toSortedMap())

    //Immutable Map
    val map = mapOf<Int,String>(1 to "Test1",2 to "Test2")
    println(map)


}