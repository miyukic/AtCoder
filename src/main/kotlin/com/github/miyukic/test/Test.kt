package com.github.miyukic.test
import java.math.BigInteger

//呼び出し回数
var count = 0

fun main() {
    val fb = FiboCash()
    for (i in 0..30) {
        println(i.toString() + ": " + fb(i))
    }
    println("呼び出し回数: " + count + " 回")
    count = 0
    //for (i in 0..30) {
    //    println(i.toString() + ": " + Fibo(i))
    //}
    println(30.toString() + ": " + Fibo(30))

    print("呼び出し回数: " + count + " 回")
}

// 動的計画法を使った方法
fun FibDB(n: Int): BigInteger {
    return BigInteger.ZERO
}

// 再帰の結果をキャッシュする方法(メモ化)
fun FiboCash(): (Int) -> BigInteger {
    val cash: MutableList<BigInteger> = mutableListOf<BigInteger>()
    return fun(n: Int): BigInteger {
        count++
        var n2 = BigInteger.ZERO  //二つ前の項
        var n1 = BigInteger.ZERO //一つ前の項

        if (n == 0) {
            cash.add(n, BigInteger.ZERO)
            return BigInteger.ZERO
        }
        if (n == 1) {
            cash.add(n, BigInteger.ZERO)
            return BigInteger.ZERO
        }
        if (n == 2) {
            //n2 = BigInteger.ZERO
            n1 = BigInteger.ONE
            cash.add(n, cash[n - 2].add(n1))
            return cash[n]
        }
        if (n == 3) {
            n2 = cash[n - 2]
            n1 = cash[n - 1]
            cash.add(n, cash[n - 2].add(n1))
            return cash[n]
        }

        n2 = cash[n - 2]
        n1 = cash[n - 1]
        cash.add(n, cash[n - 2].add(n1))
        return cash[n]
    }
}

// 普通の再帰をする
// 計算量はO(2^n)?
fun Fibo(n: Int): BigInteger {
    count++
    var n2 = BigInteger.ZERO  //二つ前の項
    var n1 = BigInteger.ZERO //一つ前の項

    if (n == 0) {
        return BigInteger.valueOf(0)
    }
    if (n == 1) {
        return BigInteger.valueOf(1)
    }
    if (n == 2) {
        //n2 = BigInteger.ZERO
        n1 = BigInteger.ONE
        return n2.add(n1)
    }

    if (n == 3) {
        n2 = Fibo(1)
        n1 = Fibo(2)
        return  n1 + n2
    }


    n2 = Fibo(n - 2)
    n1 = Fibo(n - 1)
    return n1 + n2
}