package kotlin_basics

fun main() {
    val ob = OuterClass()
    println(ob.i)

    val nested = OuterClass.NestedClass()
    println(nested.test())

    val outer = OuterClass()
    val inner = outer.InnerClass()
    println(inner.test())
}

class OuterClass {
    var i = 100

    class NestedClass() {

        fun test() {
            println("I am nested class")
        }
    }

    inner class InnerClass {
        fun test() {
            println("I am nested class $i")
        }
    }
}
