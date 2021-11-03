package com.github.miyukic.bs

fun main() {

    val A500    = readLine()?.toInt() ?: 0
    val B100    = readLine()?.toInt() ?: 0
    val C50     = readLine()?.toInt() ?: 0
    val X       = readLine()?.toInt() ?: 0

    var count: Int = 0
    for (i in 0..A500) {
        for (j in 0..B100) {
            for (k in 0..C50) {
                if (500 * i + 100 * j + k * 50 == X) {
                    count++
                }
            }
        }
    }
    print(count)
//    var count, xc = 0
//    // 50だけ
//    if (X / 50 ) <= C50) {
//        count = X / 50
//        xc = X / 50
//    }
//
//    // 50と100
//    for (i in 1..) {
//
//    }


}
