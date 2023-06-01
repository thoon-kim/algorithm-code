package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.pow

// Double의 경우 == 연산 시 약간의 오차가 발생할 수 있다

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputCount = br.readLine()!!.toInt()
    val sb = StringBuilder()

    repeat (inputCount) {
        val coordinates = br.readLine()!!.split(" ").map { it.toInt() }

        sb.appendLine(turretPoint(coordinates[0], coordinates[1], coordinates[2],
            coordinates[3], coordinates[4], coordinates[5]))
    }
    print(sb.toString())
    br.close()
}

fun turretPoint(x1: Int, y1: Int, r1: Int, x2: Int, y2: Int, r2: Int): Int {
    val distance_pow = (pow((x2 - x1).toDouble(), 2.0) + pow((y2 - y1).toDouble(), 2.0)).toInt() // 중점간 거리 distance의 제곱
    return if (x1 === x2 && y1 === y2 && r1 === r2) {
        -1
    } else if (distance_pow > pow((r1 + r2).toDouble(), 2.0)) {
        0
    } else if (distance_pow < pow((r2 - r1).toDouble(), 2.0)) {
        0
    } else if (distance_pow == pow((r2 - r1).toDouble(), 2.0).toInt()) {
        1
    } else if (distance_pow == pow((r1 + r2).toDouble(), 2.0).toInt()) {
        1
    } else {
        2
    }
}
