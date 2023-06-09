import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.io.InputStreamReader

/*
 * https://www.acmicpc.net/problem/1259
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val sb = StringBuilder()
    var number = br.readLine()
    while (number != null) {
        if (number.equals("0")) {
            break
        }
        sb.appendLine(palindrome(number))
        number = br.readLine()
    }
    print(sb.toString())
}

fun palindrome(number: String): String {
    if (number.equals("0")) return ""

    for (i in 0..number.length / 2) {
        if (number[i] != number[number.length - 1 - i]) {
            return "no"
        }
    }
    return "yes"
}