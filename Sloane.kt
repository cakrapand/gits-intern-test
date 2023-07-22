fun sloane(input: Int): String {
    var sum = 1
    val result = mutableListOf<Int>()
    for (i in 0 until input) {
        sum = (sum + i).also { result.add(it) }
    }
    return result.joinToString("-")
}

fun main(args: Array<String>) {
    val input = listOf(5, 7, 9)
    for (i in input) println(sloane(i))
}
