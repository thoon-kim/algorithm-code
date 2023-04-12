package baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val inputCount = br.readLine()!!.toInt()
    val inputList = mutableListOf<String>()
    repeat(inputCount) {
        inputList[it] = br.readLine()!!
    }

    for (i in 0..inputList[0].lastIndex) {
        for (j in 0..inputCount) {
            
        }
    }

    br.close()
    bw.flush()
    bw.close()
}