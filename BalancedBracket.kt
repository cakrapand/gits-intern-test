fun balancedBracket(input: String): String {
    val stack = ArrayDeque<Char>()

    for (char in input) {
        when (char) {
            '(', '[', '{' -> stack.addFirst(char)
            ')', ']', '}' -> {
                if (stack.isEmpty()) return "NO"
                val pop = stack.removeFirst()
                if ((char == ')' && pop != '(') || (char == '}' && pop != '{') || (char == ']' && pop != '[')) return "NO"
            }
        }
    }

    return if (stack.isEmpty()) "YES" else "NO"
}

fun main(args: Array<String>) {
    val input = listOf("{ [ ( ) ] }", "{ [ ( ] ) }", "{ ( ( [ ] ) [ ] ) [ ] }")
    for (i in input) println(balancedBracket(i))
}
