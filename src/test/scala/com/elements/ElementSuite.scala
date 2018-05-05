package com.elements

import org.scalatest.Suite
import com.elements.Element.elem

class ElementSuite extends Suite{
    def testUniformElement(): Unit = {
        val ele = elem('x', 2, 3)
        assert(ele.width == 2)
    }
}
