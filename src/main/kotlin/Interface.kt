fun main() {
    dragObjects(arrayOf(Circle(), Player()))
}

fun dragObjects(list: Array<Draggable>) {
    for (obj in list) {
        obj.drag()
    }
}

interface Draggable {
    fun drag()
    fun draw()
}

class Circle : Draggable {

    val radius = 23
    override fun drag() = println("Circle is dragging")
    override fun draw() {
        println("Circle Draw...")
    }
}

class Player : Draggable {
    override fun drag() = println("Person is dragging")
    override fun draw() {
        println("Player Draw...")
    }
}
