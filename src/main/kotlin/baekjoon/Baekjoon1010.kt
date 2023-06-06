package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

// factorial로 풀 경우 출력 초과 발생함

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputCount = br.readLine()!!.toInt()

    val dp = Array(30){ LongArray(30) }
    for(i in 1 until 30){
        dp[i][1] = i.toLong()
        for (j in 2..i){
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        }
        dp[i][i] = 1
    }

    repeat (inputCount) {
        val (n, m) = br.readLine()!!.split(' ').map { it.toInt() }
        println(dp[m][n])
    }

    br.close()
}
