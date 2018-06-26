package com.impatient

class Practice5 {

}

class BankAccount {

    val balance = 0

    def deposit = {

    }

    def withdraw = {

    }
}

class Time(val hours: Int, val minutes: Int) {

    val pminutes = hours * 60 + minutes
    if (pminutes > 24 * 60) throw new IllegalArgumentException("times must be valid")


    def before(other: Time): Boolean = {
        other.hours * 60 + other.minutes < hours * 60 + minutes
    }
}

class Construct {
    def this(name: String, age: Int) = {
        this()
        println(name + "'s age is " + age)
    }
}

object EnumColor extends Enumeration {
    val Red, Yellow, Green = Value("100")
}
