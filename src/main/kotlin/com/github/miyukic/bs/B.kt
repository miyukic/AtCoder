package com.github.miyukic.bs

fun main() {
    val input: List<Int> = readLine()?.split(" ")?.map(Integer::parseInt) ?: return
    val n = input[0] * input[1]
    if (n.and(1) == 1) {
        println("Odd")
    } else {
        println("Even")
    }

}