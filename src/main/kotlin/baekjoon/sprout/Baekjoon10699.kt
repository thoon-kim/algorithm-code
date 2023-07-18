package baekjoon.sprout

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    var date = LocalDate.now()
    val formatter = DateTimeFormatter.ISO_DATE
    print(date.format(formatter))
}