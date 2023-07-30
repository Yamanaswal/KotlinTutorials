package basics

fun main() {
    val day = Day.SUNDAY
    println(day)

    val day2 = Day.FRIDAY
    println(day2.number)

    //Iterate using values()
    for (i in Day.values()) {
        i.printFormatDay()
    }

    //Sealed Class Usage.
    val balls: Tile = Red(22, "New Ball")
    val ball = when (balls) {
        is Blue -> println("Blue")
        is Red -> println("Red")
    }
    println(ball)
}

//Using Enums Classes - types and values - restricted - single object
//Gender
enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7); //semicolon required for method define


    fun printFormatDay() {
        println("Day is $this")
    }

}


//Sealed Classes - multiple objects with unchanged types
sealed class Tile
class Red(val points: Int, type: String) : Tile()
class Blue(val points: Int) : Tile()

