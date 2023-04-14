package programmers.q42840

// 완전탐색 > 모의고사
import java.util.*
class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        val student1 = intArrayOf (1, 2, 3, 4, 5)
        val student2 = intArrayOf (2, 1, 2, 3, 2, 4, 2, 5)
        val student3 = intArrayOf (3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var scores = intArrayOf (0, 0, 0)
        answers.forEachIndexed { index, ans ->
            if (ans == student1[index % student1.size])  scores[0]++
            if (ans == student2[index % student2.size])  scores[1]++
            if (ans == student3[index % student3.size])  scores[2]++
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
    val answer = Solution()
    val answers1 = intArrayOf(1, 2, 3, 4, 5)
    val answers2 = intArrayOf(1, 3, 2, 4, 2)
    println(answer.solution(answers1).contentToString())
    println(answer.solution(answers2).contentToString())
}