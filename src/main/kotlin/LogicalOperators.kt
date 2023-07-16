fun main() {
    val above70 = false
    val knowsProgramming = true

    // && operator
    val output = above70 && knowsProgramming
    println(output)

    // || operator
    val output1 = above70 || knowsProgramming
    println(output1)

    //short circuit
    val i = 10
    var j = 11
    val output2 = i == 11 || j++ == 11
    println(output2)

    val notOp = true
    val newOp = !!notOp
    println(newOp)
}