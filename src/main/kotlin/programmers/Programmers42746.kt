package programmers.q42746

// 정렬 > 가장 큰 수
import java.util.*
class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        numbers.sortedWith(kotlin.Comparator { num1, num2 ->
            val a = (num1.toString() + num2.toString()).toInt()
            val b = (num2.toString() + num1.toString()).toInt()
            b.compareTo(a)
        }).forEach {
            answer += it
        }
        /// 0000인 경우
        if (answer[0].equals('0')) {
            answer = "0"
        }
        return answer
    }
}

fun main() {
    val answer = Solution()
    val numbers = intArrayOf(6, 10, 2)
    val numbers2 = intArrayOf(3, 30, 34, 5, 9)

    println(answer.solution(numbers))
    println(answer.solution(numbers2))
}