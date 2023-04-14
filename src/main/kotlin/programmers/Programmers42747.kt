package programmers.q42747

// 정렬 > H-Index
import java.util.*
class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sortDescending() // 인용 횟수 내림차순 정렬
        citations.forEachIndexed { index, it ->
            if (it >= index + 1) answer = index + 1 // 인용 횟수가 논문의 순위보다 크거나 같은 경우, h-index 업데이트
            else return@forEachIndexed // 반복문 종료
        }
        return answer
    }
}

fun main() {
    val answer = Solution()
    val citations = intArrayOf(3, 0, 6, 1, 5)
    println(answer.solution(citations))
}