package com.elements

//import com.elements.{ArrayElement, LineElement, UniformElement}
import com.elements.Element.elem

abstract class Element {
    def contents: Array[String]
    val height = contents.length
    val width = if (contents.length <= 0) 0 else contents(0).length
    def above(that: Element): Element = {
        val this1 = this widen that.width
        val that1 = that widen this.width
        elem(this1.contents ++ that1.contents)
    }
    def beside(that: Element): Element = {
        val this1 = this heighten that.height
        val that1 = that heighten this.height
        elem(for ((line1, line2) <- this1.contents zip that1.contents) yield line1 + line2)
    }
    def widen(w: Int): Element = {
        if (w <= width) this
        else {
            val left = elem(' ', (w - width) / 2, height)
            val right = elem(' ', w - width - left.width, height)
            left beside this beside right
        }
    }

    def heighten(h: Int): Element = {
        if (h <= height) this
        else {
            val top = elem(' ', width, (h - height) / 2)
            val bottom = elem(' ', width, h - height - top.height)
            top above this above bottom
        }
    }

    override def toString: String = this.contents mkString "\n"
}

object Element {
    private class ArrayElement(cnts: Array[String]) extends Element {
        def contents: Array[String] = cnts
    }
    private class LineElement(s: String) extends Element {
        override def contents: Array[String] = Array(s)
        override val height: Int = 1
        override val width: Int = s.length
    }
    private class UniformElement(chr: Char, override val width: Int, override val height: Int) extends Element {
        private val line = chr.toString * width
        override def contents: Array[String] = Array.fill(height)(line)
    }
    def elem(cnts: Array[String]): Element = new ArrayElement(cnts)
    def elem(s: String): Element = new LineElement(s)
    def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)
}