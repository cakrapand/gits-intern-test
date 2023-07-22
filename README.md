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
