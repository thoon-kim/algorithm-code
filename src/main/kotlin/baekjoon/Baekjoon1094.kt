package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

//지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
//가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
//만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
//이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stick = br.readLine()!!.toInt()
    val sticks = mutableListOf(64)

    println(getSumSticks(sticks, stick).count())
    br.close()
}

fun getSumSticks(sticks: MutableList<Int>, stick: Int): List<Int> {
    var sumSticks = sticks.toList().sum()
    if (sumSticks > stick) {
        var cutStick = sticks[0]
        sticks.remove(cutStick)
        cutStick = cutStick / 2
        sticks.add(0, cutStick)
        getSumSticks(sticks, stick)
    } else if (sumSticks == stick) {
        return sticks
    }
    return sticks
}

