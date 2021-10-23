package com.github.miyukic.bs

fun main() {
    val input = readLine() ?: return
    var count = 0;
    repeat(input.length) {
        if (input[it] == '1') count++
    }
    print(count)
}