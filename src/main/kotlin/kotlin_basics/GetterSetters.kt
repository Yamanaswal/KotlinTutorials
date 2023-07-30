package kotlin_basics

import java.util.*

fun main() {
    val person = PersonNew()
    person.age = 23
    person.name = "new person"
    person.email = "yamanaswal@gmail"
    println(person.name)
    println(person.age)
    println(person.email)

    person.age = -20
    person.name = ""
    person.email = ""
    println(person.name)
    println(person.age)
    println(person.email)
}

//TODO: need open keyword for inheritance.
open class PersonNew {
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age is cannot be negative")
            }
        }

    var name: String = ""
        set(value) {
            if (value != "") {
                field = value.uppercase(Locale.getDefault())
            } else {
                println("Name is cannot be empty")
            }
        }

    var email: String = "No Email"
        get() {
            return field.toLowerCase()
        }
        set(value) {
            field = value.plus(".com")
        }

}