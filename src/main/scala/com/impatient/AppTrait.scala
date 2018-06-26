package com.impatient

object AppTrait extends App {

    println(valueOfQuarter(double => if (double < 1) 1 else 0))
Array
    def valueOfQuarter(f: Double => Double) = f(0.25)
}
