package com.elements

class UniformElement(chr: Char, override val width: Int, override val height: Int) extends Element {

    private val line = chr.toString * width

    override def contents: Array[String] = Array.fill(height)(line)
}
