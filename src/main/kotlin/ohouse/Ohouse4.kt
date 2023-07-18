package ohouse

import java.util.*
// 풀지 못 함
class Ohouse4 {
    fun solution(exp: String): IntArray {
        var answer = intArrayOf()

        var numbers = mutableListOf<Int>()
        var operations = mutableListOf<Char>()

        exp.forEach {
            if (it.isDigit()) {
                numbers.add(it.code)
            } else {
                operations.add(it)
            }
        }

        for (i in 0 until operations.size) {

        }

        return answer
    }
}

fun main() {
    var ohouse = Ohouse4()
    println(ohouse.solution("3*2-5*1"))
}

/*
    연산이 3개 인 경우
    1 2 3 -> (((3*2)-5)*1) -> (((1)2)3)
    1 3 2 -> ((3*2)-(5*1)) -> ((1)2(3))
    2 1 3 -> ((3*(2-5))*1) -> ((1(2))3)
    2 3 1 -> (3*((2-5)*1)) -> (1((2)3))
    3 2 1 -> (3*(2-(5*1))) -> (1(2(3)))
 */