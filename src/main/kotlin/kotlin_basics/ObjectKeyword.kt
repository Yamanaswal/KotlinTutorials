package kotlin_basics

fun main() {
    SharingWidget.incrementFacebookLikes()
    SharingWidget.incrementFacebookLikes()
    SharingWidget.incrementTwitter()
    SharingWidget.display()

    //Object Expression
    var testOb = object : Cloneable {
        fun testing() {
            println(data)
        }

        val data = 33

        override fun clone() {
            println("I am from cloneable..")
        }
    }

    println(testOb.testing())
    println(testOb.clone())

}

object SharingWidget {
    private var fbLikes = 0
    private var tLikes = 0
    fun incrementTwitter() = tLikes++
    fun incrementFacebookLikes() = fbLikes++
    fun display() = println("Facebook Likes: $fbLikes , Twitter Likes: $tLikes")
}

interface Cloneable {
    fun clone()
}