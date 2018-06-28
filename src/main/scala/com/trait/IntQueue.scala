package com.`trait`

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {

    def get: Int

    def put(x: Int)
}

class BasicIntQueue extends IntQueue {

    private val buffer = new ArrayBuffer[Int]

    override def get = buffer.remove(0)

    def put(x: Int) {
        buffer += x
    }

    def getBuffer: ArrayBuffer[Int] = buffer
}

trait Doubling extends IntQueue {

    abstract override def put(x: Int) {
        super.put(x * 2)
    }
}

trait Increment extends IntQueue {

    abstract override def put(x: Int): Unit = {
        super.put(x + 1)
    }
}

trait Filtering extends IntQueue {

    abstract override def put(x: Int): Unit = {
        if (x >= 0) super.put(x)
    }
}