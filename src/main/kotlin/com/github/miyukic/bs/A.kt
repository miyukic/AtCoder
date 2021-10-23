package com.github.miyukic.bs

fun main() {
    val a1: Int = Integer.parseInt(readLine());
    val a2: List<Int>? = readLine()?.split(" ")?.map(Integer::parseInt)
    val a3: String? = readLine()
    if (a2 == null) return
    if (a2.size < 2) return
    print("${a1 + a2[0] + a2[1]} $a3")
}