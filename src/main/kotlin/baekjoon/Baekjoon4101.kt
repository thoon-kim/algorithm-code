package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()
    while (true) {
        val (n, m) = br.readLine()!!.split(' ').map { it.toInt() }
        if (n == 0 && m == 0) break
        sb.append(if (n > m) "Yes\n" else "No\n")
    }
    print(sb.toString())
}