package kotlin_basics

fun main() {
    val b = B()
    b.printAll()
}

////kotlin: default class, variables are public
class A

fun gm() {
    println("Good Morning Public Modifiers")
}


//Within Same File
private class PrivateClass {

}

//Within Module
internal class InternalClass {

}

open class Test {
    public var a = 10
    private var b = 11
    protected var c = 22
    internal var d = 33
}

class B : Test() {
    fun printAll() {
        println(a)
//        println(b)
        println(c)
        println(d)
    }
}

