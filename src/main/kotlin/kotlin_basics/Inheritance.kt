package kotlin_basics

fun main() {

    val objChild = Child1()
    objChild.myMethod1()
    objChild.myMethod()

    val objChild2 = Parent()
    objChild2.myMethod()

}

open class Parent {

    private var name: String = ""

    open fun myMethod() {
        println("I am Parent...")
    }

    init {
        println("Parent Created..")
    }

}

open class Child1 : Parent() {

    override fun myMethod() {
        super.myMethod()
        println("I am Child 1 ...")
    }

    fun myMethod1() {
        println("i am here child 1.. ")
    }

    init {
        println("Child Created..")
    }

}

class Child2 : Child1() {

    override fun myMethod() {
        super.myMethod()
        println("I am Child 2... ")
    }

    init {
        println("Child Created..")
    }

    fun myMethod2() {
        println("i am here child 2.. ")
        super.myMethod()
    }
}