package kotlin_basics

fun main() {
    val car: Car = Car("Bmw", "Petrol", 2333)
    val car1: Car = Car("Bmw1", "Petrol", 2333)

    println(car)
    println(car1)

    var i: Int = 20
    println(i.plus(30).toFloat())

    println("//Primary and Secondary Constructor")
    val s = Person(22)
    val s1 = Person(25, "122")
    val s2 = Person("Yaman", "123")
    println(s)
    println(s1)
    println(s2)

    println(s.canVote())
    println(s1.canVote())
    println(s2.canVote())


    //Default Constructor
    println("//Default Constructor")
    val calculator = Calculator()
    println(calculator.add(10,23))
    println(calculator.multiply(23,44))



}

class Car(val name: String, val type: String, var kmRan: Int = 0) {
    fun drive() {
        println("Car is Drive")
    }

    fun applyBrake() {
        println("Brake Applied")
    }
}

class Person(val age: Int = 0) {

    fun canVote(): Boolean {
        return age > 18
    }

    /* Note Secondary Constructor */
    constructor(ageParam: Int, type: String) : this()
    constructor(name: String, section: String) : this()


}

class Calculator {

    lateinit var sum: String

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a*b
    }
}

