package com.github.miyukic.bs

fun main() {
    val N = readLine()?.toInt() ?: 0
    val narray = readLine()?.split(" ")?.map(Integer::parseInt) ?: return
    print(check(narray, N))
}

fun check(array: List<Int>, N: Int): Int {
    val ar = array.filter { it.and(1) != 1 }
    if (ar.size == N) {
        return check(array.map { it / 2 }, N) + 1
    } else {
        return 0
    }
}
