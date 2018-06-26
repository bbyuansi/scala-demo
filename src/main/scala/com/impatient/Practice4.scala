package com.impatient

import java.util.Scanner

class Practice4 {
    var name = "hello"
    def p41 = {
        val m1 = Map("Warglaive of Azzinoth" -> 100, "Frostmourne" -> 1000)
        val m2: collection.mutable.Map[String, Double] = collection.mutable.Map()
        for ((k, v) <- m1) yield m2(k) = v * 0.8
        m2.toArray
    }

    def p42 = {
        //val in = new Scanner("words.txt")
        //while (in.next())
    }

}
