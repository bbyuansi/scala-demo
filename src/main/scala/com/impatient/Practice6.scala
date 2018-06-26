package com.impatient

class Practice6 {

}

class Point(val x: Int, val y: Int) {

    override def toString = "x: " + x + ", y: " + y
}

object Point {

    def apply(x: Int, y: Int): Point = new Point(x, y)
}

object Card extends Enumeration with App {
    val M = Value("♣")
    val T = Value("♠")
    val H = Value("♥")
    val F = Value("♦")

    def color(color: Card.Value): Boolean = {
        if (color == M || color == T) true else false
    }

    println(color(Card.H))
    println(color(Card.M))
}

object RGB extends Enumeration with App {
    val RED = Value(0xff0000, "Red")
    val BLACK = Value(0x000000, "Black")
    val GREEN = Value(0x00ff00, "Green")
    val CYAN = Value(0x00ffff, "Cyan")
    val YELLOW = Value(0xffff00, "Yellow")
    val WHITE = Value(0xffffff, "White")
    val BLUE = Value(0x0000ff, "Blue")
    val MAGENTA = Value(0xff00ff, "Magenta")

    //RGB.values.foreach(value => println(value))
    println(getClass.getConstructors)
}


