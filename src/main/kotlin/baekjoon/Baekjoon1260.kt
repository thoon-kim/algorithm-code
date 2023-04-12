import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

/*
 * https://www.acmicpc.net/problem/1260
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (nodeCount, edgeCount, rootNode) = br.readLine()!!.split(" ").map { it.toInt() }
    val nodes = List(nodeCount + 1) { mutableListOf<Int>() }
    var visited = MutableList(nodeCount + 1) { false }
    val bfsQueue: Queue<Int> = LinkedList()

    repeat(edgeCount) {
        val (node, node2) = br.readLine()!!.split(" ").map { it.toInt() }
        nodes[node].add(node2)
        nodes[node2].add(node)
    }

    val sb = StringBuilder()

    fun dfs(node: Int = rootNode) {
        visited[node] = true
        sb.append("$node ")
        for (newNode in nodes[node].sorted()) {
            if (!visited[newNode]) {
                dfs(node = newNode)
            }
        }
    }

    fun bfs(node: Int = rootNode) {
        bfsQueue.offer(node)
        visited[node] = true
        while (bfsQueue.isNotEmpty()) {
            val currentNode = bfsQueue.poll()
            sb.append("$currentNode ")
            for (newNode in nodes[currentNode].sorted()) {
                if (!visited[newNode]) {
                    bfsQueue.offer(newNode)
                    visited[newNode] = true
                }
            }
        }
    }

    dfs()
    sb.appendLine()
    visited = MutableList(nodeCount + 1) { false }
    bfs()

    println(sb.toString())
    br.close()
}