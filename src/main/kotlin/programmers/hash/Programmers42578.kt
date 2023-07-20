package programmers.q42578

// 해시 > 위장
class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1

        var counts = clothes.groupBy { it[1] }
            .values
            .map { it.size + 1 }

        for (count in counts) {
            answer *= count
        }
        return --answer
    }

    /// 다른 사람의 풀이
    fun solution2(clothes: Array<Array<String>>): Int {
        return clothes.groupBy { it[1] }
            .values
            .fold(1) {
                total, v -> total * (v.size + 1)
            }
            .minus(1)
    }

}

fun main() {
    var answer = Solution()
    val clothes = arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear"))
    val clothes1 = arrayOf(arrayOf("crow_mask", "face"), arrayOf("blue_sunglasses", "face"), arrayOf("smoky_makeup", "face"))
    println(answer.solution(clothes))
    println(answer.solution(clothes1))

    println(answer.solution2(clothes))
    println(answer.solution2(clothes1))
}
