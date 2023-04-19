import java.io.BufferedReader
import java.io.InputStreamReader
/*
 * https://www.acmicpc.net/problem/1271
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (amount, count) = br.readLine()!!.split(" ").map { it.toBigInteger() }
    println(amount / count)
    println(amount % count)
    br.close()
}