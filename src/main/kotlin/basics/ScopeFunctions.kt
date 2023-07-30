package basics

fun main() {

    val emp = Emp()
    emp.name = "Yash"
    emp.salary = 300

    //Note: refer to current obj (this) & return same object (Emp)
    val empObApply = emp.apply {
        name = "Yash Raj"
        salary = 20000
    }

    println(empObApply)

   //Note: refer to current obj (this) & return last statement object (here - 123)
    val empObLet = emp.let {
        println(it.name)
        println(it.salary)
        123
    }
    println(empObLet)


    with(emp){

    }
}

data class Emp(var name: String = "", var salary: Int = 0)