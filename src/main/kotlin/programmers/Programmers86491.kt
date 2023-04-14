package programmers.q86491

// 완전탐색 > 최소직사각형
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var first = intArrayOf()
        var second = intArrayOf()
        sizes.forEach {
            it.sort()
            first = first.plus(it[0])
            second = second.plus(it[1])
        }
        val width = first.maxOrNull()
        val height = second.maxOrNull()

        if (width != null && height != null)
            return width * height

        return 0
    }

    // 다른 사람의 풀이
    fun solution2(sizes: Array<IntArray>): Int {
        var temp1 = sizes.map {
            it.maxOrNull()!!
        }
        println(temp1.toString())

        return sizes.map {
            it.maxOrNull()!! // 각각의 배열에서 큰 값들 추출
        }.maxOrNull()!! * sizes.map { // 그 중에 최대값
            it.minOrNull()!! // 각각의 배열에서 작은 값들 추출
        }.maxOrNull()!! // 그 중에 최대값
    }
}

fun main() {
    val answer = Solution()
    val sizes1 = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
    val sizes2 = arrayOf(intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15))
    val sizes3 = arrayOf(intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11))

    println(answer.solution(sizes1))
    println(answer.solution(sizes2))
    println(answer.solution(sizes3))

    println(answer.solution2(sizes1))
}