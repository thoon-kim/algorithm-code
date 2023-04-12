package baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

//    val (nodeCount, edgeCount, rootNode) = br.readLine()!!.split(" ").map { it.toInt() }
//    val nodes = List(nodeCount + 1) { mutableListOf<Int>() }
//    var vis = MutableList(nodeCount + 1) { false }
//    val bfsQueue: Queue<Int> = LinkedList()

//    repeat(edgeCount) {
//        val (node, node2) = br.readLine()!!.split(" ").map { it.toInt() }
//        nodes[node].add(node2)
//        nodes[node2].add(node)
//    }

    br.close()
    bw.flush()
    bw.close()
}