package com.elements

class LineElement(s: String) extends Element {

    override val height: Int = 1
    override val width: Int = s.length

    override def contents: Array[String] = Array(s)
}
