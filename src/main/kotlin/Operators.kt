fun main() {
    var i = 13
    var k = 7

    println(i + k) //20
    println(i - k) //6
    println(i * k) // 91
    println(i.toFloat() / k)  //1.8
    println(i % k)

    var one = 44
    var two = 55

    println(one == two)
    println(one >= two)
    println(one <= two)
    println(one < two)
    println(one > two)

    //Post Increments
    i++
    i--
    println(i)

    i--
    i++
    println(i)

    //PreIncrement
    --i
    ++i
    ++i
    println(i)

    i = 12
    println(i++ + ++i) // 12 + 14 = 26
    println(i-- + ++i) // output = 28
}