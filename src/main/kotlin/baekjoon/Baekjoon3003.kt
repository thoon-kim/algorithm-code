package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

/*
 * https://www.acmicpc.net/problem/3003
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val findCounts = br.readLine()!!.split(" ").map { it.toInt() }
    val needCounts = listOf(1, 1, 2, 2, 2, 8)

    val sb = StringBuilder()
    if (findCounts.lastIndex == needCounts.lastIndex) {
        for (i in 0..findCounts.lastIndex) {
           val result = needCounts[i] - findCounts[i]
            sb.append("$result ")
        }
    }

    println(sb.toString())
    br.close()
}