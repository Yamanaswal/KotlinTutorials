fun main() {
    println(MyClass.MyObject.test())
    println(MyClass.MyAnotherObject.test())
    println(MyClass.newTest())

    //Factory using companion
    val pizza = Pizza.create("Tomato")
    println(pizza.toString())

    val pizza2 = Pizza.create("Cheese")
    println(pizza2.toString())


}


public class MyClass {

    // Only one companion object is allowed in class.
    companion object {

        @JvmStatic
        fun newTest(): Boolean {
            println("I Am companion of class MyClass")
            return true
        }
    }

    object MyObject {
        fun test() {
            println("I am MyObject")
        }
    }

    object MyAnotherObject {
        fun test() {
            println("I am MyAnotherObject")
        }
    }

}


//Example of Factory Pattern Using Companion

class Pizza private constructor(val type: String, val toppings: String) {
    companion object Factory {
        fun create(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "Tomato,Cheese")
                "Paneer" -> Pizza("Paneer", "Paneer,Pasta")
                else -> {
                    Pizza("Basic", "Onion,Cheese")
                }
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type: '$type' , toppings: '$toppings')"
    }
}