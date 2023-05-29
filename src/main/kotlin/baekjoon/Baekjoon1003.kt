package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputCount = br.readLine()!!.toInt()

    val arr = Array(41) { 0 to 0}.also {
        it[0] = 1 to 0
        it[1] = 0 to 1
    }

    repeat (arr.size) {
       if (it > 1) {
           arr[it] = arr[it - 1].first + arr[it - 2].first to arr[it - 1].second + arr[it - 2].second
       }
    }

    repeat (inputCount) {
        val n = br.readLine().toInt()
        println("${arr[n].first} ${arr[n].second}")
    }
    br.close()
}
