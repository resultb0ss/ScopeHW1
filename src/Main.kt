fun main() {

    val str = "Добрый день Руслан"
    str.let(::printString)
}

fun printString(string: String){
    println("$string с длиной ${string.length}")
}