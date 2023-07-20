package programmers.q42579

// 해시 > 베스트 앨범
import java.util.*
class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = intArrayOf()

        val albums = genres.toList().zip(plays.toList())
//        albums.groupBy ()


        return answer
    }
}

fun main() {
    val answer = Solution()
    val genres = arrayOf("classic", "pop", "classic", "classic", "pop")
    val plays = intArrayOf(500, 600, 150, 800, 2500)
    println(answer.solution(genres, plays))
}