package ohouse

class Ohouse2 {
    fun solution(num: Int): Boolean {
        var numString = num.toString()
        for (i in 0..numString.length / 2) {
            if (numString[i] != numString[numString.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}

fun main() {
    var ohouse = Ohouse2()
    println(ohouse.solution(12321))
    println(ohouse.solution(1122112))
}
