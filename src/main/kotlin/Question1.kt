// OX퀴즈
//fun main(args: Array<String>) {
//    var quiz: Array<String> = arrayOf("3 - 4 = -3", "5 + 6 = 11")
//    println(solution(quiz).get(0))
//}
//fun solution(quiz: Array<String>): Array<String?> {
//    val answer = arrayOfNulls<String>(quiz.size)
//    for (i in quiz.indices) {
//        val arr = quiz[i].split(" ".toRegex())
//        if (arr[1].equals("+")) {
//            answer[i] = if (arr[0].toInt() + arr[2].toInt() == arr[4].toInt()) "O" else "X"
//        } else if (arr[1].equals("-")) {
//            answer[i] = if (arr[0].toInt() - arr[2].toInt() == arr[4].toInt()) "O" else "X"
//        }
//    }
//    return answer
//}

fun main(args: Array<String>) {
    var babbling1: Array<String> = arrayOf("aya", "yee", "u", "maa", "wyeoo")
    var babbling2: Array<String> = arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
    println(babbling1)
    println(babbling2)
}

// 옹알이
fun solution(babbling: Array<String>): Int {
    var answer: Int = 0
    return answer
}