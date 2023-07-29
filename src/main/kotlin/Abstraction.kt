fun main() {
//    val shape = Shape() // not possible - due to abstract class
    val circle = CircleNew()
    println(circle.name)
    println(circle.area(23))
    println(circle.area())
}


abstract class Shape {
    var name: String = ""
    abstract fun area(radius: Int): Double
    abstract fun area(): Double

    fun display() {
        println("Area Displays:: ")
        println(area())
    }
}

class CircleNew() : Shape() {
    override fun area(radius: Int): Double {
        return (Math.PI * (radius * radius)).toDouble()
    }

    override fun area(): Double {
        return 0.0
    }
}