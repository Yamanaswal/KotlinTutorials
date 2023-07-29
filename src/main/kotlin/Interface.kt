fun main()
{
    dragObjects(arrayOf(Circle(), Player()))
}

fun dragObjects(list: Array<Draggable>)
{
    for(obj in list)
    {
        obj.drag()
    }
}

interface Draggable
{
    fun drag()
}

class Circle: Draggable
{
    override fun drag() = println("Circle is dragging")
}

class Player: Draggable
{
    override fun drag() = println("Person is dragging")
}
