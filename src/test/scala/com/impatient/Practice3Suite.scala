package com.impatient

import org.scalatest.FunSuite

class Practice3Suite extends FunSuite{

    test("p31") {
        val a:Array[Int] = (new Practice3).p31(5)
        assert(a.length == 5 && a.max < 5 && a.min >= 0)
        val b:Array[Int] = (new Practice3).p31(10)
        assert(b.length == 10 && b.max < 10 && b.min >= 0)
    }

    test("p32") {
        val array1 = (new Practice3).p32(Array(12, 13, 13, 22))
        assert(array1.sameElements(Array(13, 12, 22, 13)))
        val array2 = (new Practice3).p32(Array(1))
        assert(array2.sameElements(Array(1)))
    }

    test("p33") {
        val array1 = (new Practice3).p33(Array(12, 13, 13, 22))
        assert(array1.sameElements(Array(13, 12, 22, 13)))
        val array2 = (new Practice3).p33(Array(1))
        assert(array2.sameElements(Array(1)))
    }

    test("p34") {
        val array1 = (new Practice3).p34(Array(-1, 3, 100, -2))
        assert(array1 sameElements  Array(3, 100, -1, -2))
    }

    test("p35") {
        assert((new Practice3).p35(Array(1.1, 1.2, 1.3)) == 1.2)
        assert((new Practice3).p35(Array(2.2d, 3.3d, 4.4d)) == (2.2d + 3.3d + 4.4d) / 3)
    }
}
