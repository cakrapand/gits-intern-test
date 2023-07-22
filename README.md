# Balanced Bracket Problem

## Deskripsi
Fungsi ```balancedBracket()``` adalah sebuah fungsi yang dapat memeriksa apakah sebuah string mengandung tanda kurung yang seimbang. Sebuah string dianggap seimbang jika setiap tanda kurung pembuka memiliki tanda kurung penutup yang sesuai dengan urutan yang benar. Fungsi ini akan mengembalikan ```YES``` jika seimbang dan ```NO``` jika tidak seimbang.

## Time Complexity: O(n)
Kompleksitas waktu pada fungsi ```balancedBracket()``` adalah ```O(n)```, dimana nilai n adalah panjang dari Char yang ada pada String ```input```. Kompleksitas waktu ini didapat karena fungsi melakukan iterasi setiap Char di dalam String ```input``` tepat satu kali. Sedangkan, semua operasi di dalam perulangan memerlukan waktu yang konstan, ```O(1)```.
```kotlin
// Melakukan iterasi sebanyak panjang character yang ada di dalam String input
for (char in input) {
    // Melakukan operasi dengan kompleksitas waktu konstan
    when (char) {
        '(', '[', '{' -> stack.addFirst(char)
        ')', ']', '}' -> {
            if (stack.isEmpty()) return "NO"
            val pop = stack.removeFirst()
            if ((char == ')' && pop != '(') || (char == '}' && pop != '{') || (char == ']' && pop != '[')) return "NO"
        }
    }
}
```

## Screenshot Output
### Sloane’s OEIS Problem
Input pada test case ini adalah 5, 7 dan 9
```kotlin
val input = listOf(5, 7, 9)
for (i in input) println(sloane(i))
```
![sloane](https://github.com/cakrapand/gits-intern-test/assets/73237464/1d6523a3-aa07-4655-81d0-6ca38307ba02)
----
### Dense Ranking Problem
Sampel input pada test case adalah
* Case 1
    * 5
    * 100, 80, 80, 70
    * 3
    * 60, 70, 100
* Case 2
    * 7
    * 100, 100, 50, 40, 40, 20, 10
    * 4
    * 5, 25, 50, 120
* Case 3
    * 9
    * 110, 110, 100, 90, 90, 80, 75, 70, 60
    * 6
    * 50, 75, 90, 95, 105, 120
```kotlin
val scoreSize = listOf(5, 7, 9)
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
```
![denseranking](https://github.com/cakrapand/gits-intern-test/assets/73237464/712ca5b6-6041-42e3-83ce-b8db6aa105fd)
----
### Balanced Bracket Problem
Sampel input pada test case ini adalah:
* { [ ( ) ] }
* { [ ( ] ) }
* { ( ( [ ] ) [ ] ) [ ] }
```kotlin
val input = listOf("{ [ ( ) ] }", "{ [ ( ] ) }", "{ ( ( [ ] ) [ ] ) [ ] }")
for (i in input) println(balancedBracket(i))
```
![balancedbracket](https://github.com/cakrapand/gits-intern-test/assets/73237464/a3aef3f5-992b-4543-acb3-3c8058b99e4c)
