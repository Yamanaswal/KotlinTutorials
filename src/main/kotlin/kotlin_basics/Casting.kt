package kotlin_basics

fun main() {

    val circle = Circle()

    //Type Checking.
    if (circle is Circle) {

    }

    //Type Casting
    val objs = arrayOf(Circle(), Player())

    for (ob in objs) {
        //Smart Casting
        if (ob is Circle) {
            ob.draw()
            println(ob.radius)
        } else {
            (ob as Player).draw()
        }
    }
}