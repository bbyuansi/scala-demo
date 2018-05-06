package com.`match`

class Matcher() {

    def mNumber(m: Int): Unit = {
        m match {
            case 1 => println("1")
            case _ => println("hehe")
        }
    }
    def isEmptyList(list: List[Any]): Unit = list match {
            case List(_, _*) => println("not empty!")
            case Nil => println("empty")

    }


}
