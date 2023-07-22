fun denseRanking(scores: List<Int>, gitsScores: List<Int>): String {
    val result = mutableListOf<Int>()
    val sortedScores = scores.sortedDescending().distinct()

    var i = sortedScores.size - 1
    for (p in gitsScores) {
        while (i >= 0 && p >= sortedScores[i]) i--
        result.add(i + 2)
    }
    return result.joinToString(" ")
}

fun main(args: Array<String>) {

    val scoreSize = listOf(4, 7, 9)
    val scores = listOf(
        listOf(100, 80, 80, 70),
        listOf(100, 100, 50, 40, 40, 20, 10),
        listOf(110, 110, 100, 90, 90, 80, 75, 70, 60)
    )

    val gitsSize = listOf(3, 4, 6)
    val gitsScores = listOf(
        listOf(60, 70, 100),
        listOf(5, 25, 50, 120),
        listOf(50, 75, 90, 95, 105, 120)
    )

    for(i in scores.indices) println(denseRanking(scores[i], gitsScores[i]))
}
