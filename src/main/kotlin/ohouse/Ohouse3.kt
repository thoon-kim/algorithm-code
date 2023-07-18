package ohouse

class Ohouse3 {
    fun solution(s: String): String {
        val map = mutableMapOf<Char, Int>()
        s.forEach {
            if (map.containsKey(it)) {
                map[it] = map[it]!! + 1
            } else {
                map[it] = 1
            }
        }

        val arr = map.toList().sortedWith(compareBy( {
            -it.second
        }, {
            it.first
        }))

        val sb = StringBuilder()
        arr.forEach { pair ->
            repeat(pair.second) {
                sb.append(pair.first)
            }
        }
        return sb.toString()
    }
}

fun main() {
    var ohouse = Ohouse3()
    println(ohouse.solution("bucketplace"))
}
