package programmers.skillcheck

class Programmers2544 {

    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        val student1 = intArrayOf (1, 2, 3, 4, 5)
        val student2 = intArrayOf (2, 1, 2, 3, 2, 4, 2, 5)
        val student3 = intArrayOf (3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var scores = intArrayOf (0, 0, 0)
        answers.forEachIndexed { index, ans ->
            if (ans == student1[index % student1.size]) ++scores[0]
            if (ans == student2[index % student2.size]) ++scores[1]
            if (ans == student3[index % student3.size]) ++scores[2]
        }

        val maxScore = scores.maxOrNull()!!
        scores.forEachIndexed { index, it ->
            if (it == maxScore)
                answer = answer.plus(index + 1)
        }
        return answer
    }
}

fun main() {
    val answer = Programmers2544()
    val question1 = intArrayOf(1, 2, 3, 4, 5)
    val question2 = intArrayOf(1, 3, 2, 4, 2)
    println(answer.solution(question1).contentToString())
    println(answer.solution(question2).contentToString())
}