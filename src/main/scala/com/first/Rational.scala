package com.first

class Rational(n: Int, d: Int) {
    require(d != 0)

    val number: Int = n
    val denom: Int = d

    override def toString: String = number + "/" + d

    def add(that: Rational): Rational = {
        new Rational(that.number * d + that.denom * number, denom * that.denom)
    }

}
