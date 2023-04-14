package programmers.q42748

// 정렬 > K번째 수
import java.util.*
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for (command in commands) {
            val splitedArray = array.copyOfRange(command[0] - 1, command[1])
            splitedArray.sort()
//            println("${Arrays.toString(splitedArray)}[${command[2] - 1}] = ${splitedArray[command[2] - 1]}")
            answer = answer.plus(splitedArray[command[2] - 1])
        }
        return answer
    }

    /// 다른 사람의 풀이
    fun solution2(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1))
                .sorted()[command[2] - 1]
        }.toIntArray()
    }
}

fun main() {
    val answer = Solution()
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
    println(answer.solution(array, commands).contentToString())
    println(answer.solution2(array, commands).contentToString())
}