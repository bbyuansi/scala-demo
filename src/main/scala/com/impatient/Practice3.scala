package com.impatient

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Practice3 {

    def p31(n: Int): Array[Int] = {
        val arr = for (i <- 0 until n) yield Random.nextInt(n)
        arr.toArray
    }

    def p32(array: Array[Int]): Array[Int] = {
        for (i <- 1 until array.length by 2) {
            val temp = array(i - 1)
            array(i - 1) = array(i)
            array(i) = temp
        }
        array
    }

    def p33(array: Array[Int]): Array[Int] = {
        for (i <- 1 until array.length by 2)
            yield {
                val temp = array(i - 1)
                array(i - 1) = array(i)
                array(i) = temp
            }
        array
    }

    def p34(array: Array[Int]): Array[Int] = {
        val a = for (i <- 0 to 1; j <- array.indices if (array(j) >= 0 && i == 0) || (i == 1 && array(j) < 0))
            yield array(j)
        a.toArray
    }

    def p35(arr: Array[Double]): Double = {
        arr.sum / arr.length
    }

    def p36(arr1: Array[Int], arr2: ArrayBuffer[Int]) = {

        (arr1.reverse, arr2.reverse)
    }
}
