package ohouse

import java.lang.StringBuilder

class Ohouse1 {
    fun solution(target: String, typed: String): Boolean {
        val sb = StringBuilder()
        for (i in 0 until typed.length) {
            if (sb.length > 0) {
                if (sb[sb.lastIndex] != typed[i]) {
                    sb.append(typed[i])
                } else if (target.length > sb.lastIndex + 1) {
                    if (sb[sb.lastIndex] == target[sb.lastIndex + 1]) {
                        sb.append(typed[i])
                    }
                }
            } else {
                sb.append(typed[i])
            }
        }
        return target.equals(sb.toString())
    }
}

fun main() {
    var ohouse = Ohouse1()
    println(ohouse.solution("ohoouse", "oohooussse"))
    println(ohouse.solution("bucketplace", "buckeetpladce"))
}
