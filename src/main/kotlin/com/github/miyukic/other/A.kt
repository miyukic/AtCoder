// https://atcoder.jp/contests/typical90/tasks/typical90_p
/*
A 円硬貨、B 円硬貨、C 円硬貨をそれぞれ 0 枚以上使ってちょうど N 円を支払うとき、使う硬貨の枚数として考えられる最小値を求めてください。

ただし、それぞれの硬貨は無数にあるものとします。

制約
1≤A,B,C,N≤10
9

A,B,C はすべて異なる
合計 9999 枚以下の硬貨でちょうど N 円を支払うことができる
入力はすべて整数
 */
package com.github.miyukic.other

import kotlin.math.*

fun main() {
    val N = readLine()?.toInt() ?: 0;
    val nList = readLine()?.split(" ")?.map(Integer::parseInt)?.sortedDescending() ?: return

    print(f(nList, N))

}

fun f(nList: List<Int>, N: Int): Int {
    val A: Int = if (N / nList[0] >= 9999) 9999 else N / nList[0]
    val B: Int = if (N / nList[1] >= 9999) 9999 else N / nList[1]

    var a = 0;
    var b = 0;
    var result = 9999

    for (i in A downTo 0) {
        a = nList[0] * i
        if (a > N) continue
        for (j in B downTo 0) {
            b = nList[1] * j
            if (a + b > N) continue
            if ((N - (a + b)) % nList[2] == 0) {
                val k = (N - (a + b)) / nList[2]
                result = min(result, i + j + k)
            }
        }
    }
    return result
}