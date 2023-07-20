package programmers.skillcheck.level1

class Programmers911 {
    fun solution(s: String): String {
        val words = mutableListOf<String>()
        s.split(' ').forEach { word ->
            val sb = StringBuilder()
            word.forEachIndexed { index, c ->
                if (index % 2 == 0) {
                    sb.append(word[index].uppercase())
                } else {
                    sb.append(word[index].lowercase())
                }
            }
            words.add(sb.toString())
        }
        return words.joinToString(" ")
    }
}

fun main() {
    val answer = Programmers911()
    val text = "try hello world"
    println(answer.solution(text))
}